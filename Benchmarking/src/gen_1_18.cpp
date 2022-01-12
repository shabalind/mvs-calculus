  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s1 p1;
    s2(std::vector<std::vector<s0>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s1 p1;
    s3(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s3 p0;
    s3 p1;
    s5(s3 v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s2 p0;
    std::vector<s5> p1;
    s6(s2 v0, std::vector<s5> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s6 &v0, const double &v1) {
    s6 v3 = v0;
    const s2 v4 = v3.p0;
    const s1 v8 = v4.p1;
    const std::vector<s0> v17 = v8.p1;
    const s0 v55 = v17[0];
    const std::vector<std::vector<double>> v31 = v55.p0;
    std::vector<std::vector<double>> v52 = v31;
    const std::vector<double> v36 = v52[0];
    v52[0] = v36;
    const std::vector<double> v89 = v52[0];
    v52[0] = v89;
    const double v155 = v89[0];
    return v155;
  }
  int main() {
    s6 v0({ { { { { { { 0.0 } }, { { 1.0 } } } }, { { { { 2.0 } }, { { 3.0 } } } } }, { { { { { { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 } } } } }, { { { { 8.0 } }, { { 9.0 } } } } } }, { { { { { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } }, { { { { { { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 } } } } }, { { { { 20.0 } }, { { 21.0 } } } } } }, { { { { { 22.0 } }, { { 23.0 } } }, { { { 24.0 } }, { { 25.0 } } }, { { { 26.0 } }, { { 27.0 } } } }, { { { { { { 28.0 } }, { { 29.0 } } } }, { { { { 30.0 } }, { { 31.0 } } } } }, { { { { 32.0 } }, { { 33.0 } } } } } } } } });
    double v1(34.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
