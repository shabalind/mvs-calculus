  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s0 p2;
    s1(std::vector<s0> v0, std::vector<s0> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    std::vector<s0> p0;
    std::vector<std::vector<s1>> p1;
    s3(std::vector<s0> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  s0 f72(const s0 &v0) {
    const std::vector<s0> v3 { v0 };
    const s0 v1 = v3[0];
    const s0 v7 = v3[0];
    const std::vector<std::vector<double>> v4 = v1.p0;
    const std::vector<std::vector<double>> v11 = v1.p1;
    std::vector<std::vector<double>> v5 = v4;
    const std::vector<std::vector<double>> v2 = v0.p0;
    s0 v23 = v7;
    v23.p1 = v11;
    v23.p0 = v5;
    v23.p0 = v4;
    v23.p0 = v5;
    v23.p0 = v4;
    const std::vector<std::vector<double>> v30 = v23.p1;
    const s0 v18(v4, v30);
    v23.p0 = v4;
    const std::vector<std::vector<double>> v32 = v18.p0;
    v23.p0 = v2;
    s0 v89 = v18;
    v23.p0 = v32;
    return v89;
  }
  s0 f70(const s0 &v0) {
    const s0 v1 = f72(v0);
    const std::vector<std::vector<double>> v6 = v0.p1;
    std::vector<std::vector<double>> v3 = v6;
    const std::vector<std::vector<double>> v8 = v0.p1;
    s0 v7 = v1;
    v7.p1 = v8;
    std::vector<std::vector<double>> v21 = v8;
    const std::vector<std::vector<double>> v12 = v7.p0;
    std::vector<std::vector<double>> v15 = v12;
    const std::vector<double> v17 = v3[0];
    std::vector<std::vector<double>> v11 = v21;
    std::vector<double> v10 = v17;
    const std::vector<double> v14 = v11[0];
    v21[0] = v14;
    const std::vector<double> v34 = v12[0];
    const s0 v35(v15, v3);
    const double v42 = v10[0];
    v7.p1 = v11;
    v21[0] = v10;
    double v20 = v42;
    const double v74 = v20 * v42;
    v11[0] = v34;
    const s0 v94 = f72(v35);
    v3[0] = v14;
    v10[0] = v74;
    return v94;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s3 &v1, const double &v2) {
    const s0 v6 = f70(v0);
    const std::vector<std::vector<double>> v19 = v6.p1;
    const std::vector<double> v11 = v19[0];
    const double v16 = v11[0];
    const double v26 = v2 + v16;
    return v26;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } } });
    s3 v1({ { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } } } } });
    double v2(21.0);
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
