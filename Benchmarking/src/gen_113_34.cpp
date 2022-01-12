  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s2(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f21(const double &v0) {
    double v1 = v0;
    v1 = v0;
    double v2 = v1;
    double v5 = v0;
    double v3 = v1;
    double v6 = v0;
    double v7 = v3;
    double v11 = v5;
    double v9 = v3;
    double v15 = v7;
    double v14 = v11;
    v7 = v5;
    v6 = v11;
    double v23 = v15;
    v5 = v1;
    double v18 = v6;
    double v25 = v15;
    double v17 = v2;
    const std::vector<double> v16 { v3 };
    double v34 = v17;
    std::vector<double> v35 = v16;
    double v55 = v23;
    const double v32 = v16[0];
    const double v59 = v35[0];
    v35[0] = v59;
    double v26 = v9;
    std::vector<double> v27 = v35;
    v27[0] = v3;
    const double v69 = v16[0];
    std::vector<double> v31 = v27;
    double v38 = v26;
    v35[0] = v38;
    double v29 = v0;
    v27[0] = v34;
    v27[0] = v0;
    v35 = v31;
    std::vector<double> v70 = v35;
    std::vector<double> v42 = v31;
    const double v76 = v35[0];
    v42[0] = v3;
    v34 = v76;
    std::vector<double> v43 = v70;
    const double v78 = v42[0];
    double v92 = v6;
    v3 = v9;
    v43[0] = v29;
    v31[0] = v69;
    const double v50 = v43[0];
    const std::vector<double> v37 { v14, v92, v17, v32, v25, v55 };
    v25 = v78;
    v70[0] = v50;
    v3 = v7;
    std::vector<double> v108 = v37;
    double v106 = v50;
    v108[2] = v18;
    v35[0] = v106;
    std::vector<double> v117 = v108;
    const double v77 = v117[5];
    v43[0] = v38;
    return v77;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const double &v1) {
    double v20 = v1;
    const double v17 = f21(v20);
    double v49 = v17;
    return v49;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { { { 0.0 } }, { { 1.0 } } } }, { { { { 2.0 } }, { { 3.0 } } } } }, { { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } } } } });
    double v1(10.0);
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
