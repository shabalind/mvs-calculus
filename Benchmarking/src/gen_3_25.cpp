  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s2 p1;
    s3(s0 v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const s3 v6 = v0[1];
    const s2 v5 = v6.p1;
    double v19 = v1;
    v19 = v1;
    const std::vector<s0> v35 = v5.p1;
    const s0 v57 = v35[1];
    const std::vector<std::vector<double>> v37 = v57.p0;
    const std::vector<double> v46 = v37[0];
    std::vector<double> v49 = v46;
    const std::vector<std::vector<double>> v109 { v49 };
    const std::vector<double> v87 = v109[0];
    v49[0] = v19;
    const double v117 = v87[0];
    return v117;
  }
  int main() {
    std::vector<s3> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { { 30.0 } }, { { 31.0 }, { 32.0 } } }, { { { 33.0 } }, { { 34.0 }, { 35.0 } } } } } } });
    double v1(36.0);
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
