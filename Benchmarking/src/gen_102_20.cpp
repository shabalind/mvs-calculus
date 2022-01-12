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
    std::vector<std::vector<s0>> p0;
    s1 p1;
    s2(std::vector<std::vector<s0>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    s2 p1;
    s4(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s4 &v0, const s1 &v1, const std::vector<s0> &v2, const double &v3) {
    const s0 v13 = v2[0];
    const std::vector<std::vector<double>> v12 = v13.p0;
    const s0 v20 = v2[0];
    const std::vector<std::vector<double>> v21 = v20.p1;
    std::vector<std::vector<double>> v35 = v21;
    const std::vector<double> v80 = v35[0];
    std::vector<double> v43 = v80;
    const double v88 = v80[0];
    const std::vector<double> v76 = v12[0];
    const std::vector<double> v64 = v35[0];
    const std::vector<double> v65 = v12[0];
    v35[1] = v43;
    const double v62 = v43[0];
    std::vector<double> v70 = v80;
    const double v86 = v64[0];
    v43[0] = v88;
    const double v140 = v70[0];
    v70[0] = v86;
    v35[1] = v76;
    v43[0] = v140;
    v35[0] = v65;
    return v62;
  }
  int main() {
    s4 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { { { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } } }, { { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } } } } });
    s1 v1({ { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { { { 27.0 } }, { { 28.0 }, { 29.0 } } } }, { { { { 30.0 } }, { { 31.0 }, { 32.0 } } } } } });
    std::vector<s0> v2({ { { { 33.0 } }, { { 34.0 }, { 35.0 } } } });
    double v3(36.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
