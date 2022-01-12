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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f33(const double &v0) {
    const double v1 = v0 / v0;
    double v5 = v1;
    double v4 = v1;
    double v3 = v0;
    v3 = v4;
    double v10 = v1;
    double v6 = v10;
    v6 = v0;
    double v8 = v5;
    double v2 = v10;
    double v7 = v2;
    double v9 = v5;
    double v11 = v0;
    double v13 = v3;
    double v18 = v13;
    double v15 = v6;
    double v25 = v18;
    v3 = v9;
    const std::vector<double> v12 { v3, v15, v3, v0, v9, v0, v10 };
    const std::vector<double> v31 { v15, v11, v10 };
    double v24 = v25;
    std::vector<double> v30 = v31;
    std::vector<double> v34 = v30;
    std::vector<double> v41 = v12;
    const double v40 = v34[2];
    const std::vector<std::vector<double>> v16 { v12, v41, v41, v12 };
    v41[2] = v40;
    v34[2] = v18;
    v10 = v7;
    v30[1] = v10;
    v7 = v9;
    double v26 = v2;
    v34[0] = v6;
    v30[2] = v6;
    const double v48 = v34[1];
    v34[2] = v0;
    const double v33 = v31[1];
    v30[2] = v33;
    std::vector<std::vector<double>> v67 = v16;
    v41[0] = v8;
    std::vector<std::vector<double>> v49 = v67;
    std::vector<std::vector<double>> v57 = v49;
    const std::vector<double> v75 = v57[3];
    const double v32 = v75[0];
    v34[1] = v24;
    v15 = v26;
    double v52 = v11;
    v30[1] = v48;
    v34[2] = v52;
    double v62 = v32;
    return v62;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s1 &v1, const double &v2) {
    const double v7 = f33(v2);
    const std::vector<s0> v8 = v1.p0;
    const double v16 = v7 / v7;
    const s0 v18 = v8[0];
    const std::vector<std::vector<double>> v21 = v18.p0;
    const double v38 = f33(v2);
    double v35 = v38;
    v35 = v16;
    const double v96 = f33(v7);
    double v50 = v16;
    const std::vector<double> v40 = v21[1];
    std::vector<double> v73 = v40;
    v73[0] = v35;
    v73[0] = v50;
    v73[0] = v96;
    const double v161 = v73[0];
    return v161;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    s1 v1({ { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } });
    double v2(24.0);
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
