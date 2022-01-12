  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  std::vector<double> f38(const std::vector<double> &v0) {
    const double v3 = v0[0];
    const double v7 = v0[0];
    const double v2 = v0[0];
    const double v6 = v0[0];
    std::vector<double> v1 = v0;
    std::vector<double> v4 = v1;
    std::vector<double> v11 = v1;
    double v14 = v7;
    const double v16 = v1[0];
    v4[0] = v6;
    const double v12 = v11[0];
    std::vector<double> v23 = v1;
    std::vector<double> v13 = v11;
    const double v21 = v11[0];
    v23[0] = v3;
    v4[0] = v12;
    const double v19 = v1[0];
    std::vector<double> v22 = v1;
    std::vector<double> v49 = v1;
    v22[0] = v3;
    const double v18 = v13[0];
    const double v32 = v23[0];
    std::vector<double> v27 = v4;
    v23[0] = v19;
    double v47 = v16;
    double v79 = v2;
    const double v51 = v1[0];
    double v30 = v18;
    v22[0] = v32;
    std::vector<double> v61 = v13;
    const std::vector<std::vector<double>> v52 { v27 };
    std::vector<std::vector<double>> v123 = v52;
    v49[0] = v30;
    double v40 = v51;
    std::vector<std::vector<double>> v72 = v123;
    v123[0] = v23;
    const std::vector<double> v77 = v72[0];
    const std::vector<double> v121 = v123[0];
    v49[0] = v30;
    const std::vector<std::vector<double>> v156 { v77, v22, v49, v4, v121, v61 };
    v27[0] = v47;
    v61[0] = v14;
    std::vector<std::vector<double>> v229 = v156;
    v61[0] = v21;
    const std::vector<double> v111 = v229[0];
    v49[0] = v79;
    v229[1] = v111;
    v13[0] = v40;
    return v111;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const std::vector<std::vector<s0>> v3 { v0, v0, v0 };
    const std::vector<s0> v7 = v3[0];
    const s0 v8 = v7[1];
    const std::vector<std::vector<double>> v5 = v8.p1;
    const std::vector<double> v17 = v5[0];
    std::vector<double> v13 = v17;
    const std::vector<double> v20 = v5[0];
    const std::vector<double> v18 = f38(v13);
    const std::vector<double> v41 = f38(v20);
    const std::vector<double> v30 = f38(v41);
    const std::vector<double> v56 = f38(v30);
    v13 = v56;
    const std::vector<double> v59 = f38(v18);
    const std::vector<double> v43 = f38(v13);
    const std::vector<double> v89 = f38(v43);
    const double v132 = v59[0];
    const double v104 = v132 - v1;
    double v103 = v104;
    v13 = v89;
    return v103;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } });
    double v1(16.0);
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
