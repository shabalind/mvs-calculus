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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s2 p1;
    s3(s0 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s11 {
    std::vector<std::vector<s3>> p0;
    std::vector<std::vector<s1>> p1;
    s11(std::vector<std::vector<s3>> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  double f7(const std::vector<std::vector<s11>> &v0, const double &v1) {
    double v26 = v1;
    double v57 = v26;
    double v32 = v57;
    return v32;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s11>> &v0, const s1 &v1, const double &v2) {
    const double v7 = f7(v0, v2);
    const double v6 = f7(v0, v7);
    const std::vector<s11> v9 = v0[0];
    const double v18 = f7(v0, v7);
    const double v15 = f7(v0, v6);
    std::vector<std::vector<s11>> v17 = v0;
    const double v37 = f7(v0, v2);
    const double v39 = f7(v17, v37);
    const double v67 = f7(v0, v39);
    const double v74 = f7(v0, v67);
    v17[0] = v9;
    const double v44 = f7(v17, v67);
    const double v73 = f7(v0, v74);
    const double v46 = f7(v0, v73);
    const double v70 = f7(v0, v44);
    const double v156 = f7(v0, v15);
    const double v77 = v156 + v37;
    const double v55 = f7(v17, v70);
    const std::vector<double> v60 { v55, v18, v77, v74, v46 };
    const double v112 = v60[4];
    return v112;
  }
  int main() {
    std::vector<std::vector<s11>> v0({ { { { { { { { { 0.0 } }, { { 1.0 } } }, { { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } } } } } }, { { { { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } } } }, { { { { { 14.0 } }, { { 15.0 } } }, { { { 16.0 } }, { { 17.0 } } } } } } } } });
    s1 v1({ { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } } });
    double v2(22.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
