import { TestBed, inject } from '@angular/core/testing';

import { ApiSpringService } from './api-spring.service';

describe('ApiSpringService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ApiSpringService]
    });
  });

  it('should be created', inject([ApiSpringService], (service: ApiSpringService) => {
    expect(service).toBeTruthy();
  }));
});
