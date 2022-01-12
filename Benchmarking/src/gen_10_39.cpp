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
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<s0> p1;
    s3(s2 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f14(const s0 &v0, const s0 &v1) {
    s0 v4 = v0;
    const s1 v7(v1, v4);
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<std::vector<std::vector<double>>> v5 { v8, v8, v8, v8, v8, v8 };
    const s0 v12 = v7.p1;
    std::vector<std::vector<std::vector<double>>> v16 = v5;
    const std::vector<std::vector<double>> v10 = v16[1];
    v16[1] = v8;
    const std::vector<std::vector<double>> v17 = v5[2];
    v4.p0 = v10;
    const std::vector<double> v34 = v17[1];
    const std::vector<std::vector<double>> v24 { v34 };
    std::vector<std::vector<double>> v21 = v24;
    const std::vector<std::vector<double>> v87 = v16[5];
    std::vector<std::vector<double>> v35 = v24;
    const s0 v60(v87, v35);
    const std::vector<std::vector<double>> v69 = v12.p1;
    s0 v47 = v60;
    v47.p1 = v69;
    v4.p1 = v21;
    return v47;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const std::vector<s0> v7 = v0.p1;
    const s0 v5 = v7[0];
    const s0 v3 = f14(v5, v5);
    const std::vector<std::vector<double>> v8 = v3.p0;
    const std::vector<double> v10 = v8[1];
    const double v141 = v10[0];
    return v141;
  }
  int main() {
    s3 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } });
    double v1(24.0);
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
