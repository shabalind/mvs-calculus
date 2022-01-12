  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<double>> f22(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v4 = v0[0];
    std::vector<double> v1 = v4;
    std::vector<double> v8 = v4;
    std::vector<std::vector<double>> v7 = v0;
    std::vector<std::vector<double>> v3 = v7;
    const std::vector<double> v11 = v3[0];
    std::vector<double> v2 = v8;
    const std::vector<std::vector<double>> v12 { v4, v2, v8 };
    const std::vector<double> v19 = v12[0];
    std::vector<std::vector<double>> v14 = v3;
    v14[0] = v11;
    const double v18 = v8[0];
    std::vector<std::vector<double>> v21 = v14;
    v21[0] = v1;
    v2 = v11;
    const std::vector<double> v44 = v7[0];
    v2[0] = v18;
    const double v26 = v19[0];
    v21[0] = v44;
    v8[0] = v26;
    v1[0] = v18;
    return v21;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s1 v7 = v0.p0;
    s2 v5 = v0;
    const s0 v8 = v5.p1;
    v5.p1 = v8;
    v5.p1 = v8;
    v5.p0 = v7;
    v5.p0 = v7;
    s0 v4 = v8;
    const s0 v3 = v7.p1;
    v5.p1 = v4;
    s0 v2 = v3;
    const s0 v6 = v0.p1;
    const std::vector<std::vector<double>> v12 = v6.p0;
    const std::vector<double> v16 = v12[1];
    const s2 v14(v7, v2);
    std::vector<std::vector<double>> v13 = v12;
    s2 v11 = v0;
    v11 = v5;
    const std::vector<std::vector<double>> v26 = v2.p1;
    v13[1] = v16;
    v5 = v11;
    const std::vector<std::vector<double>> v35 = f22(v26);
    const std::vector<double> v37 = v13[1];
    s2 v9 = v14;
    v2 = v8;
    const std::vector<std::vector<double>> v18 = f22(v35);
    const s1 v50 = v5.p0;
    const std::vector<std::vector<double>> v33 = f22(v35);
    const std::vector<double> v21 = v26[0];
    v5 = v0;
    s0 v23 = v3;
    const s0 v25 = v0.p1;
    const std::vector<std::vector<s0>> v20 = v50.p0;
    const std::vector<std::vector<double>> v41 = f22(v18);
    v9.p1 = v23;
    const std::vector<std::vector<double>> v61 = f22(v26);
    const s0 v36 = v9.p1;
    v2 = v25;
    s1 v84 = v50;
    const s2 v86(v84, v25);
    std::vector<std::vector<double>> v55 = v13;
    v4.p1 = v41;
    v4.p0 = v55;
    v23.p0 = v13;
    const s0 v66 = v14.p1;
    v84.p1 = v36;
    const s1 v71(v20, v66);
    const std::vector<std::vector<double>> v116 = v23.p0;
    const std::vector<std::vector<double>> v151 = f22(v33);
    v13[0] = v21;
    v84.p0 = v20;
    v9.p0 = v71;
    v9.p0 = v84;
    v5 = v86;
    v23.p1 = v151;
    const double v81 = v37[0];
    const s0 v76(v116, v61);
    v9.p1 = v76;
    v5.p1 = v66;
    v4.p0 = v116;
    return v81;
  }
  int main() {
    s2 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } });
    double v1(12.0);
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
