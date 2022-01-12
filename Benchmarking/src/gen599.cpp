  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f9(const s0 &v0) {
    s0 v1 = v0;
    s0 v7 = v1;
    s0 v8 = v0;
    s0 v3 = v8;
    const std::vector<std::vector<double>> v11 = v3.p1;
    const std::vector<std::vector<double>> v10 = v3.p1;
    s0 v4 = v7;
    const std::vector<double> v9 = v10[0];
    const std::vector<double> v18 = v11[2];
    const std::vector<std::vector<double>> v16 = v0.p0;
    std::vector<double> v35 = v9;
    const std::vector<std::vector<double>> v27 = v8.p1;
    std::vector<std::vector<double>> v15 = v16;
    v15[0] = v35;
    const s0 v13(v16, v27);
    const std::vector<double> v22 = v15[0];
    s0 v17 = v4;
    v15[0] = v22;
    v15[0] = v18;
    std::vector<std::vector<double>> v19 = v16;
    const double v28 = v9[0];
    const double v20 = v35[0];
    std::vector<std::vector<double>> v30 = v15;
    const std::vector<s0> v23 { v4, v7, v13, v17, v8, v3 };
    std::vector<s0> v57 = v23;
    const std::vector<std::vector<double>> v43 = v13.p1;
    std::vector<s0> v48 = v57;
    const std::vector<std::vector<std::vector<double>>> v21 { v30, v15, v16, v30, v16, v19, v16 };
    v57[3] = v1;
    const std::vector<std::vector<double>> v79 = v13.p1;
    v3.p0 = v30;
    const std::vector<std::vector<double>> v58 = v17.p0;
    const s0 v46(v30, v11);
    v4.p1 = v10;
    v15 = v19;
    const std::vector<std::vector<double>> v53 = v1.p0;
    v57[2] = v0;
    const std::vector<std::vector<std::vector<double>>> v121 { v58 };
    v8.p1 = v79;
    v4.p0 = v53;
    v1.p1 = v43;
    std::vector<std::vector<double>> v76 = v27;
    const std::vector<std::vector<double>> v44 = v4.p1;
    const std::vector<double> v71 = v76[2];
    const std::vector<std::vector<double>> v78 = v121[0];
    const s0 v113 = v57[2];
    v30[0] = v71;
    double v64 = v28;
    v17.p0 = v78;
    v3.p0 = v53;
    const double v110 = v64 / v20;
    const s0 v66 = v48[1];
    v7.p1 = v79;
    double v62 = v110;
    v35[0] = v62;
    const std::vector<std::vector<double>> v215 = v3.p0;
    const std::vector<std::vector<double>> v90 = v66.p0;
    v3.p0 = v15;
    v17 = v46;
    const std::vector<std::vector<double>> v183 = v113.p1;
    s0 v219 = v8;
    v4.p0 = v215;
    const std::vector<std::vector<double>> v204 = v21[0];
    v4.p0 = v15;
    const std::vector<std::vector<double>> v173 = v219.p1;
    v219.p0 = v204;
    v3.p1 = v183;
    const s0 v178(v90, v44);
    v3.p1 = v173;
    v8.p1 = v11;
    v3.p1 = v11;
    return v178;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<s2> &v1, const double &v2) {
    double v7 = v2;
    const double v12 = v7 * v7;
    const s2 v3 = v1[0];
    const std::vector<s0> v16 = v3.p1;
    double v8 = v12;
    const s0 v20 = v16[0];
    const s0 v93 = f9(v20);
    const std::vector<std::vector<double>> v99 = v93.p0;
    const std::vector<double> v70 = v99[0];
    std::vector<double> v85 = v70;
    double v89 = v8;
    const double v81 = v85[0];
    const double v88 = v89 + v2;
    double v91 = v2;
    const double v378 = v88 - v12;
    const std::vector<double> v152 { v91, v378, v12, v378, v81, v81, v12 };
    std::vector<double> v301 = v152;
    const double v150 = v301[6];
    return v150;
  }
  int main() {
    std::vector<s2> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } });
    std::vector<s2> v1({ { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } } } });
    double v2(32.0);
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
