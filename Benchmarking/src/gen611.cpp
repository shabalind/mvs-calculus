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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s1 f110(const s1 &v0) {
    const s0 v7 = v0.p0;
    s0 v2 = v7;
    const std::vector<s0> v1 = v0.p1;
    const std::vector<s1> v6 { v0, v0, v0 };
    const s1 v4(v2, v1);
    std::vector<s1> v3 = v6;
    const std::vector<std::vector<double>> v9 = v7.p0;
    const s1 v15 = v6[2];
    v2.p0 = v9;
    const s0 v22 = v15.p0;
    v3[0] = v15;
    v3[0] = v4;
    const std::vector<std::vector<double>> v48 = v22.p0;
    v2.p0 = v48;
    const s1 v32 = v3[0];
    std::vector<s1> v58 = v6;
    v58[0] = v32;
    const s1 v47 = v58[0];
    s1 v86 = v47;
    return v86;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v6 = v0[0];
    double v8 = v1;
    const s1 v10 = v6[0];
    const s1 v12 = f110(v10);
    const s0 v11 = v12.p0;
    const std::vector<std::vector<double>> v25 = v11.p0;
    const std::vector<double> v20 = v25[1];
    std::vector<double> v35 = v20;
    std::vector<std::vector<double>> v30 = v25;
    v35[0] = v8;
    v30[0] = v35;
    v30[0] = v35;
    v35[0] = v1;
    const std::vector<double> v90 = v30[0];
    v35[0] = v8;
    const double v106 = v90[0];
    return v106;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } } } });
    double v1(6.0);
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
