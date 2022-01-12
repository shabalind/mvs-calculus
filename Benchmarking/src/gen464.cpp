  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f57(const std::vector<double> &v0) {
    const double v2 = v0[0];
    const double v5 = v0[0];
    const double v7 = v0[0];
    std::vector<double> v1 = v0;
    v1[0] = v5;
    std::vector<double> v8 = v0;
    const double v9 = v8[0];
    double v6 = v9;
    double v4 = v5;
    v1[0] = v2;
    double v12 = v4;
    v1[0] = v7;
    const double v15 = v0[0];
    v8[0] = v15;
    const double v19 = v1[0];
    std::vector<double> v11 = v1;
    v11 = v1;
    v8[0] = v9;
    std::vector<double> v13 = v1;
    v13[0] = v19;
    std::vector<double> v16 = v8;
    v8[0] = v6;
    v1[0] = v15;
    const double v22 = v11[0];
    const double v42 = v11[0];
    const double v32 = v22 / v22;
    std::vector<double> v20 = v13;
    std::vector<double> v28 = v16;
    std::vector<double> v35 = v20;
    const double v67 = v35[0];
    v11[0] = v5;
    std::vector<double> v33 = v16;
    const double v72 = v20[0];
    v33[0] = v12;
    const double v50 = v28[0];
    const double v69 = v1[0];
    v13[0] = v69;
    std::vector<double> v48 = v8;
    v48[0] = v67;
    v1[0] = v50;
    const double v38 = v28[0];
    const std::vector<std::vector<double>> v80 { v35, v28, v33, v0, v11 };
    std::vector<std::vector<double>> v76 = v80;
    std::vector<std::vector<double>> v46 = v80;
    v46[2] = v11;
    std::vector<std::vector<double>> v47 = v80;
    v76[1] = v48;
    v48[0] = v72;
    const std::vector<double> v56 = v47[0];
    v8[0] = v50;
    const std::vector<std::vector<std::vector<double>>> v85 { v47, v76, v47 };
    std::vector<std::vector<std::vector<double>>> v115 = v85;
    std::vector<std::vector<std::vector<double>>> v116 = v115;
    const std::vector<std::vector<double>> v81 = v116[2];
    const double v70 = v56[0];
    const std::vector<double> v66 = v46[1];
    const std::vector<double> v68 = v81[3];
    v46[2] = v33;
    v16[0] = v38;
    v48[0] = v7;
    v33[0] = v5;
    v1[0] = v32;
    v28[0] = v70;
    v11[0] = v42;
    v47[3] = v66;
    return v68;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    std::vector<std::vector<s0>> v6 = v0;
    const std::vector<s0> v4 = v6[0];
    std::vector<s0> v7 = v4;
    const std::vector<s0> v11 = v6[0];
    const s0 v14 = v7[0];
    v7[0] = v14;
    const s0 v30 = v4[0];
    const std::vector<s0> v40 = v0[0];
    v6[0] = v4;
    v6[0] = v7;
    v6[0] = v40;
    const std::vector<std::vector<double>> v29 = v30.p1;
    v6[0] = v7;
    const std::vector<double> v27 = v29[0];
    const std::vector<double> v50 = f57(v27);
    v6 = v0;
    v6[0] = v4;
    v6[0] = v11;
    const double v104 = v50[0];
    v6[0] = v7;
    return v104;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } } });
    double v1(4.0);
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
