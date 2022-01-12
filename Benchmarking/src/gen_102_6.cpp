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
    s1(s0 v0): p0(v0) { }
  };
  struct s2 {
    double p0;
    s2(double v0): p0(v0) { }
  };
  struct s9 {
    s1 p0;
    s9(s1 v0): p0(v0) { }
  };
  double f98(const double &v0) {
    double v6 = v0;
    const s2 v4(v6);
    const double v19 = v4.p0;
    return v19;
  }
  s2 f95(const s2 &v0) {
    const double v7 = v0.p0;
    const double v8 = v0.p0;
    const std::vector<s2> v6 { v0, v0 };
    const double v1 = f98(v8);
    const s2 v12 = v6[0];
    s2 v16 = v12;
    const double v11 = f98(v7);
    const double v20 = f98(v11);
    const double v22 = v0.p0;
    const double v24 = v22 - v20;
    v16.p0 = v1;
    v16.p0 = v24;
    return v16;
  }
  double f52(const double &v0) {
    double v7 = v0;
    double v2 = v0;
    const std::vector<double> v1 { v2, v0, v0, v7, v7 };
    const double v3 = f98(v2);
    std::vector<double> v8 = v1;
    double v6 = v3;
    std::vector<double> v9 = v8;
    const double v11 = f98(v6);
    v9[0] = v3;
    const double v17 = f98(v0);
    const double v14 = v1[2];
    const double v16 = v8[0];
    std::vector<double> v25 = v8;
    const double v19 = v9[2];
    const std::vector<std::vector<double>> v27 { v25, v1, v8, v25, v1 };
    const s2 v13(v7);
    const double v30 = v9[4];
    v7 = v11;
    v8[2] = v19;
    const std::vector<double> v26 = v27[4];
    std::vector<std::vector<double>> v43 = v27;
    const std::vector<double> v38 = v43[2];
    v8[4] = v7;
    const double v53 = v13.p0;
    s2 v36 = v13;
    const double v42 = v36.p0;
    std::vector<double> v22 = v26;
    const double v51 = f98(v0);
    const double v125 = v38[1];
    const s2 v81 = f95(v13);
    const s2 v90 = f95(v36);
    v36.p0 = v125;
    s2 v77 = v36;
    const double v32 = v77.p0;
    v8 = v22;
    const s2 v68 = f95(v36);
    const double v57 = v13.p0;
    v77.p0 = v125;
    v43[4] = v38;
    s2 v55 = v68;
    v22[0] = v42;
    const double v91 = v90.p0;
    const std::vector<s2> v54 { v81, v77, v90, v77 };
    const s2 v69 = f95(v68);
    v55.p0 = v14;
    const s2 v78 = f95(v69);
    v22[4] = v53;
    v25[0] = v17;
    const double v84 = v36.p0;
    v55.p0 = v16;
    v22[2] = v84;
    const s2 v179 = f95(v13);
    v55.p0 = v6;
    v77.p0 = v91;
    const double v97 = v11 - v57;
    const s2 v99 = v54[0];
    v36.p0 = v32;
    const s2 v214 = v54[3];
    const double v160 = v55.p0;
    const double v203 = f98(v19);
    v7 = v19;
    v9[2] = v160;
    v55.p0 = v203;
    v77 = v78;
    v36.p0 = v0;
    const double v279 = v214.p0;
    v36.p0 = v53;
    v8[2] = v51;
    v25[4] = v97;
    v55.p0 = v279;
    const double v204 = v179.p0;
    const s2 v183 = f95(v99);
    v36.p0 = v204;
    v36.p0 = v30;
    const double v266 = v183.p0;
    return v266;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s9>> &v0, const double &v1) {
    double v8 = v1;
    const double v6 = f52(v8);
    const double v22 = f98(v6);
    const double v47 = f98(v8);
    v8 = v47;
    const double v91 = v47 - v22;
    return v91;
  }
  int main() {
    std::vector<std::vector<s9>> v0({ { { { { { { 0.0 } }, { { 1.0 } } } } } }, { { { { { { 2.0 } }, { { 3.0 } } } } } } });
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
