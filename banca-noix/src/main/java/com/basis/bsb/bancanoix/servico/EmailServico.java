package com.basis.bsb.bancanoix.servico;

import com.basis.bsb.bancanoix.config.ApplicationProperties;
import com.basis.bsb.bancanoix.servico.dto.EmailDTO;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class EmailServico {

    private final JavaMailSender javaMailSender;
    private final ApplicationProperties applicationProperties;

    @SneakyThrows
    public void enviarEmail(EmailDTO emailDTO){
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mime = new MimeMessageHelper(mimeMessage);

        mime.setTo(emailDTO.getDestinatario());
        mime.setFrom(applicationProperties.getEnderecoRemetente());
        mime.setSubject(emailDTO.getAssunto());

        for (String s: emailDTO.getCopias()){
            mime.addCc(s);
        }

        mime.setText(emailDTO.getCorpo());
        javaMailSender.send(mimeMessage);

    }

}
