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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s1 p1;
    s2(std::vector<std::vector<s0>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s2 p0;
    std::vector<std::vector<s1>> p1;
    s7(s2 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  s0 f25(const s0 &v0) {
    s0 v2 = v0;
    v2 = v0;
    s0 v6 = v0;
    s0 v5 = v2;
    s0 v1 = v6;
    v6 = v1;
    const std::vector<std::vector<double>> v4 = v5.p1;
    const std::vector<double> v3 = v4[0];
    const double v8 = v3[0];
    const std::vector<double> v15 = v4[0];
    std::vector<double> v7 = v3;
    const double v10 = v15[0];
    v7[0] = v10;
    v7[0] = v8;
    const std::vector<double> v23 = v4[0];
    v7[0] = v10;
    std::vector<std::vector<double>> v9 = v4;
    v9[0] = v23;
    const std::vector<std::vector<double>> v13 = v5.p0;
    s0 v22 = v1;
    s0 v17 = v2;
    v9[0] = v15;
    v9[0] = v15;
    std::vector<std::vector<double>> v31 = v13;
    v22.p0 = v31;
    const std::vector<std::vector<double>> v42 = v22.p1;
    s0 v18 = v17;
    std::vector<std::vector<double>> v14 = v31;
    const std::vector<double> v37 = v42[0];
    v31[0] = v7;
    v9[0] = v7;
    v9[0] = v7;
    v18.p0 = v14;
    v31[1] = v37;
    v17.p1 = v9;
    return v18;
  }
  s0 f24(const s0 &v0) {
    const s0 v2 = f25(v0);
    const std::vector<std::vector<double>> v3 = v2.p1;
    const std::vector<std::vector<double>> v7 = v2.p1;
    const std::vector<double> v5 = v3[0];
    const s0 v6 = f25(v2);
    std::vector<std::vector<double>> v11 = v7;
    const std::vector<double> v10 = v7[0];
    std::vector<std::vector<double>> v14 = v7;
    v14[0] = v10;
    const std::vector<double> v43 = v3[0];
    const s0 v52 = f25(v2);
    v11[0] = v10;
    std::vector<std::vector<double>> v13 = v11;
    const std::vector<std::vector<double>> v36 = v0.p1;
    std::vector<double> v23 = v43;
    std::vector<std::vector<double>> v22 = v14;
    const s0 v99 = f25(v6);
    std::vector<double> v26 = v10;
    const s0 v25 = f25(v52);
    const std::vector<std::vector<double>> v18 = v99.p0;
    const std::vector<std::vector<double>> v40 = v0.p0;
    s0 v50 = v0;
    v50.p0 = v18;
    const std::vector<double> v30 = v18[1];
    v50.p1 = v36;
    v11[0] = v5;
    v13[0] = v23;
    v50.p0 = v40;
    const std::vector<std::vector<double>> v27 = v2.p1;
    v50.p1 = v13;
    const s0 v77 = f25(v25);
    const s0 v87 = f25(v77);
    v50.p1 = v7;
    v22[0] = v30;
    const std::vector<std::vector<double>> v37 = v87.p1;
    const s0 v67 = f25(v50);
    const std::vector<std::vector<double>> v49 = v77.p1;
    const s0 v101 = f25(v67);
    v50.p1 = v36;
    v50.p1 = v27;
    v11[0] = v5;
    v14[0] = v5;
    v50.p1 = v13;
    v50.p1 = v49;
    s0 v85 = v101;
    v14[0] = v23;
    v22[0] = v5;
    const s0 v125 = f25(v85);
    const double v65 = v10[0];
    const std::vector<std::vector<double>> v100 = v25.p0;
    v26[0] = v65;
    v50.p1 = v37;
    v85.p1 = v22;
    v13[0] = v26;
    v50.p0 = v100;
    return v125;
  }
  s0 f16(const s0 &v0) {
    s0 v3 = v0;
    const std::vector<std::vector<double>> v5 = v0.p0;
    const s0 v6 = f25(v0);
    v3.p0 = v5;
    const s0 v18 = f25(v0);
    const std::vector<std::vector<double>> v11 = v3.p1;
    s0 v25 = v6;
    const s0 v14 = f24(v25);
    const std::vector<std::vector<double>> v17 = v18.p0;
    v3.p0 = v17;
    s0 v34 = v3;
    const s0 v72 = f24(v14);
    const s0 v40 = f24(v14);
    v34.p1 = v11;
    const std::vector<std::vector<double>> v41 = v72.p0;
    v34.p1 = v11;
    v3.p0 = v41;
    const std::vector<std::vector<double>> v28 = v6.p1;
    v3.p1 = v28;
    const std::vector<std::vector<double>> v24 = v40.p1;
    v25.p1 = v28;
    v25.p1 = v24;
    return v34;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v4 = v1.p1;
    const std::vector<double> v6 = v4[0];
    const s0 v10 = f16(v1);
    const std::vector<double> v15 = v4[0];
    const std::vector<double> v80 = v4[0];
    const double v41 = v15[0];
    std::vector<double> v38 = v6;
    const std::vector<std::vector<double>> v30 = v10.p0;
    const double v54 = v38[0];
    std::vector<std::vector<double>> v52 = v30;
    double v81 = v2;
    const std::vector<double> v177 = v52[0];
    v52[1] = v38;
    std::vector<double> v116 = v38;
    v38 = v116;
    v52[1] = v80;
    v38[0] = v54;
    const std::vector<double> v144 { v2, v41, v54, v81 };
    const double v270 = v144[2];
    v38 = v177;
    return v270;
  }
  int main() {
    s7 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } }, { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } } }, { { { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } }, { { { { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { 27.0 }, { 28.0 } }, { { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 } } } } } }, { { { { { { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 } } } }, { { { { 39.0 }, { 40.0 } }, { { 41.0 } } } } } } } });
    s0 v1({ { { 42.0 }, { 43.0 } }, { { 44.0 } } });
    double v2(45.0);
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
