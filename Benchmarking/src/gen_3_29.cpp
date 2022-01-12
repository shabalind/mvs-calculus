  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<std::vector<s0>> p0;
    s3 p1;
    s6(std::vector<std::vector<s0>> v0, s3 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s6 &v0, const double &v1) {
    const std::vector<std::vector<s0>> v3 = v0.p0;
    const std::vector<s0> v15 = v3[0];
    std::vector<s0> v21 = v15;
    const s0 v16 = v21[0];
    v21[0] = v16;
    const s0 v33 = v21[0];
    const s2 v20(v33, v33);
    const s0 v32 = v20.p1;
    const std::vector<std::vector<double>> v43 = v32.p0;
    const std::vector<double> v82 = v43[0];
    const double v71 = v82[0];
    return v71;
  }
  int main() {
    s6 v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } }, { { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } } }, { { { { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 } } } } } });
    double v1(27.0);
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
