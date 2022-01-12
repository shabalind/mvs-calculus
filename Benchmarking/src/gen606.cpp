  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  s0 f21(const s0 &v0) {
    return v0;
  }
  s0 f16(const s0 &v0) {
    s0 v4 = v0;
    const double v1 = v4.p1;
    const std::vector<std::vector<double>> v8 = v4.p0;
    std::vector<std::vector<double>> v3 = v8;
    std::vector<std::vector<double>> v6 = v3;
    v4.p1 = v1;
    const std::vector<double> v7 = v6[0];
    const std::vector<std::vector<double>> v9 = v0.p0;
    const double v15 = v7[0];
    std::vector<std::vector<double>> v5 = v9;
    double v10 = v1;
    const std::vector<std::vector<double>> v23 { v7, v7, v7, v7, v7 };
    const s0 v16 = f21(v4);
    const std::vector<double> v12 = v23[4];
    const s0 v25 = f21(v16);
    const std::vector<double> v14 = v8[0];
    const std::vector<std::vector<double>> v17 = v4.p0;
    const s0 v20 = f21(v25);
    const double v19 = v7[0];
    v4.p1 = v15;
    const double v29 = v15 * v15;
    v4.p1 = v10;
    const std::vector<double> v39 = v23[4];
    const std::vector<std::vector<double>> v38 = v16.p0;
    std::vector<std::vector<double>> v37 = v23;
    const double v42 = v20.p1;
    const std::vector<std::vector<double>> v24 = v0.p0;
    std::vector<std::vector<double>> v35 = v17;
    v4.p1 = v29;
    v4.p1 = v42;
    std::vector<std::vector<double>> v34 = v37;
    v4.p0 = v24;
    double v32 = v15;
    const std::vector<double> v51 = v5[1];
    v6[0] = v12;
    std::vector<std::vector<double>> v49 = v38;
    v4.p0 = v35;
    const std::vector<double> v43 = v34[4];
    const double v31 = v29 * v19;
    v37[0] = v12;
    v37[3] = v14;
    const std::vector<std::vector<double>> v55 = v4.p0;
    const s0 v99(v3, v31);
    v4.p1 = v32;
    std::vector<double> v86 = v39;
    v35[1] = v7;
    const s0 v101 = f21(v99);
    v4.p0 = v55;
    v5[1] = v43;
    v34[1] = v12;
    v34[0] = v7;
    v3[1] = v51;
    v4.p0 = v49;
    v5[0] = v86;
    return v101;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s1 &v1, const double &v2) {
    s0 v5 = v0;
    const s0 v3 = f16(v5);
    s1 v7 = v1;
    const std::vector<std::vector<double>> v10 = v3.p0;
    v7 = v1;
    std::vector<std::vector<double>> v11 = v10;
    v11 = v10;
    const std::vector<double> v8 = v11[1];
    v5.p1 = v2;
    v11[0] = v8;
    const std::vector<std::vector<s0>> v30 = v7.p1;
    const std::vector<s0> v32 = v30[0];
    const s0 v23 = v32[0];
    v5 = v23;
    v11[0] = v8;
    v7 = v1;
    const double v38 = v8[0];
    return v38;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, 2.0 });
    s1 v1({ { { { 3.0 }, { 4.0 } }, 5.0 }, { { { { { 6.0 }, { 7.0 } }, 8.0 } }, { { { { 9.0 }, { 10.0 } }, 11.0 } } } });
    double v2(12.0);
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
