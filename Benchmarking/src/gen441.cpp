  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    s0 p1;
    s5(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f93(const s5 &v0, const s0 &v1) {
    s5 v5 = v0;
    v5 = v0;
    const s0 v6 = v5.p1;
    const s0 v9 = v0.p0;
    const std::vector<std::vector<double>> v2 = v6.p1;
    const std::vector<std::vector<double>> v14 = v9.p0;
    std::vector<std::vector<double>> v47 = v2;
    const s0 v26 = v0.p1;
    const std::vector<double> v30 = v14[1];
    s0 v49 = v26;
    v49.p1 = v2;
    v47[0] = v30;
    v49.p1 = v47;
    return v49;
  }
  s5 f75(const s5 &v0) {
    return v0;
  }
  s5 f66(const s5 &v0) {
    s5 v6 = v0;
    s5 v2 = v6;
    const s0 v1 = v2.p1;
    const std::vector<std::vector<double>> v3 = v1.p1;
    std::vector<std::vector<double>> v8 = v3;
    v2.p1 = v1;
    const s5 v10 = f75(v0);
    s0 v16 = v1;
    const s5 v18 = f75(v10);
    const std::vector<double> v20 = v8[0];
    const s0 v27 = v18.p1;
    v16.p1 = v3;
    const s5 v30(v27, v16);
    const s5 v26 = f75(v30);
    const std::vector<std::vector<double>> v21 = v1.p1;
    v8[0] = v20;
    v2.p1 = v1;
    v16.p1 = v8;
    const s5 v97 = f75(v26);
    v16.p1 = v21;
    const s0 v106 = v6.p1;
    v6.p0 = v106;
    return v97;
  }
  s5 f59(const s5 &v0) {
    const s5 v5 = f75(v0);
    s5 v8 = v0;
    s5 v3 = v5;
    const s0 v6 = v0.p0;
    const std::vector<std::vector<double>> v4 = v6.p0;
    s5 v11 = v3;
    v3.p1 = v6;
    s0 v19 = v6;
    const s5 v17 = f66(v5);
    const s5 v14 = f75(v0);
    s5 v13 = v17;
    const std::vector<std::vector<double>> v20 = v6.p0;
    const s0 v10 = v11.p1;
    const s5 v30 = f75(v17);
    const std::vector<double> v16 = v20[2];
    v11.p0 = v6;
    s0 v18 = v6;
    const s0 v27 = v14.p1;
    const s5 v48 = f66(v13);
    const s0 v26 = f93(v30, v10);
    v3 = v11;
    const s0 v28 = v3.p0;
    const s5 v38 = f66(v13);
    const std::vector<s5> v103 { v48, v0, v11, v11, v38, v8, v17 };
    const s5 v49 = v103[1];
    v3.p0 = v18;
    v8.p0 = v28;
    v3.p1 = v26;
    const std::vector<std::vector<double>> v102 = v27.p1;
    std::vector<s5> v157 = v103;
    std::vector<std::vector<double>> v44 = v102;
    const std::vector<std::vector<double>> v65 = v19.p0;
    v18.p1 = v44;
    std::vector<std::vector<double>> v47 = v4;
    v44[0] = v16;
    const s0 v54 = v30.p1;
    const std::vector<double> v74 = v65[2];
    const s0 v96 = v49.p1;
    const s5 v124 = v157[3];
    v11.p0 = v54;
    v18.p0 = v47;
    v44[0] = v74;
    v8.p0 = v96;
    s5 v91 = v124;
    v47[1] = v74;
    return v91;
  }
  s0 f12(const s0 &v0) {
    const s5 v4(v0, v0);
    const s5 v2 = f59(v4);
    const s0 v1 = v2.p0;
    s0 v3 = v1;
    return v3;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const double &v2) {
    const s0 v5 = v0[0];
    const s0 v6 = f12(v5);
    const double v3 = v2 / v2;
    const std::vector<std::vector<double>> v20 = v6.p1;
    const std::vector<double> v35 = v20[0];
    const double v103 = v35[0];
    double v81 = v103;
    v81 = v3;
    return v81;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } });
    s0 v1({ { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } });
    double v2(16.0);
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
