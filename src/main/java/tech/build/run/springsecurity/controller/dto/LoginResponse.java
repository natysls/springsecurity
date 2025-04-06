package tech.build.run.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {

}
