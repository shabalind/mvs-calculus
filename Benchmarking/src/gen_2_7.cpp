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
  struct s7 {
    std::vector<std::vector<s1>> p0;
    s0 p1;
    s7(std::vector<std::vector<s1>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f53(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<double> v2 = v6[0];
    s0 v5 = v0;
    const double v3 = v2[0];
    const std::vector<std::vector<double>> v1 = v0.p0;
    const std::vector<std::vector<double>> v9 = v5.p0;
    v5.p0 = v1;
    std::vector<double> v8 = v2;
    double v11 = v3;
    v8[0] = v11;
    v5.p0 = v1;
    const std::vector<std::vector<double>> v10 = v5.p1;
    const std::vector<double> v4 = v10[0];
    v5.p1 = v10;
    const std::vector<std::vector<double>> v27 = v5.p1;
    std::vector<std::vector<double>> v15 = v27;
    const std::vector<std::vector<double>> v19 = v5.p1;
    const std::vector<double> v14 = v27[0];
    const s0 v18(v6, v19);
    s0 v24 = v18;
    const double v50 = v4[0];
    v24.p0 = v6;
    v8[0] = v50;
    v24.p0 = v9;
    s0 v21 = v18;
    v24.p1 = v10;
    double v17 = v50;
    v21.p0 = v9;
    std::vector<std::vector<double>> v31 = v15;
    v5.p1 = v31;
    const double v49 = v4[0];
    v15[0] = v14;
    v8[0] = v17;
    v31[0] = v8;
    s0 v32 = v24;
    double v47 = v49;
    const std::vector<std::vector<double>> v61 = v24.p0;
    v5.p1 = v19;
    v24 = v21;
    v31[0] = v8;
    v11 = v47;
    v5.p0 = v9;
    v21.p0 = v61;
    v24.p0 = v9;
    v5.p1 = v27;
    return v32;
  }
  s0 f51(const s0 &v0) {
    const s0 v2 = f53(v0);
    const s0 v5 = f53(v0);
    const s0 v4 = f53(v0);
    const std::vector<std::vector<double>> v6 = v5.p0;
    const std::vector<double> v3 = v6[0];
    const std::vector<std::vector<double>> v9 = v2.p0;
    std::vector<double> v1 = v3;
    const s0 v7 = f53(v0);
    const std::vector<std::vector<double>> v13 = v5.p1;
    const std::vector<std::vector<double>> v8 = v0.p1;
    const std::vector<std::vector<double>> v11 = v7.p1;
    s0 v14 = v4;
    v14.p0 = v6;
    s0 v12 = v0;
    v12.p1 = v13;
    const std::vector<double> v19 = v6[0];
    v14 = v4;
    std::vector<double> v23 = v3;
    std::vector<std::vector<double>> v25 = v11;
    s0 v17 = v14;
    std::vector<std::vector<double>> v16 = v25;
    s0 v28 = v12;
    const double v24 = v19[0];
    const std::vector<std::vector<double>> v22 = v4.p0;
    std::vector<std::vector<double>> v33 = v16;
    v12.p1 = v25;
    v23[0] = v24;
    const std::vector<std::vector<double>> v27 = v28.p0;
    const s0 v31 = f53(v17);
    const std::vector<double> v46 = v27[1];
    const std::vector<std::vector<double>> v30 = v14.p0;
    v17.p0 = v6;
    const std::vector<std::vector<double>> v34 = v4.p1;
    v33[0] = v1;
    const std::vector<std::vector<double>> v32 = v0.p0;
    v28.p0 = v30;
    const std::vector<std::vector<double>> v20 = v17.p1;
    const double v62 = v1[0];
    const s0 v45 = f53(v14);
    v14.p1 = v8;
    v25[0] = v19;
    const std::vector<double> v72 = v25[0];
    s0 v43 = v31;
    std::vector<double> v71 = v3;
    double v57 = v62;
    v71[0] = v57;
    v14.p1 = v34;
    v33[0] = v72;
    v23[0] = v62;
    const std::vector<std::vector<double>> v70 = v0.p0;
    v43 = v45;
    v12.p0 = v9;
    v43.p0 = v9;
    v14 = v2;
    v14.p0 = v27;
    v25[0] = v71;
    const std::vector<double> v75 = v32[1];
    const std::vector<std::vector<std::vector<double>>> v86 { v70, v22 };
    v25[0] = v23;
    std::vector<std::vector<std::vector<double>>> v161 = v86;
    v25 = v20;
    const std::vector<std::vector<double>> v159 = v86[1];
    v1[0] = v57;
    v43.p0 = v6;
    v43.p1 = v8;
    v12.p0 = v159;
    v25[0] = v46;
    const s0 v74 = f53(v43);
    std::vector<std::vector<std::vector<double>>> v96 = v161;
    const std::vector<std::vector<double>> v90 = v96[1];
    v12.p1 = v33;
    v33[0] = v75;
    v14.p0 = v90;
    return v74;
  }
  s7 f36(const s7 &v0) {
    s7 v4 = v0;
    v4 = v0;
    const std::vector<std::vector<s1>> v8 = v4.p0;
    std::vector<std::vector<s1>> v3 = v8;
    const s0 v19 = v4.p1;
    const s0 v6 = f51(v19);
    const std::vector<s1> v21 = v8[1];
    const s7 v10(v3, v6);
    s7 v30 = v0;
    const std::vector<std::vector<s1>> v14 = v30.p0;
    v4 = v0;
    const std::vector<std::vector<s1>> v24 = v10.p0;
    const std::vector<s1> v25 = v14[2];
    std::vector<std::vector<s1>> v37 = v24;
    s7 v17 = v10;
    v30.p0 = v24;
    std::vector<std::vector<s1>> v38 = v37;
    v3[1] = v21;
    v38[1] = v25;
    v3 = v38;
    return v17;
  }
  s7 f4(const s7 &v0) {
    const std::vector<s7> v7 { v0, v0, v0, v0 };
    const s7 v2 = f36(v0);
    std::vector<s7> v5 = v7;
    std::vector<s7> v12 = v5;
    const s7 v11 = v12[3];
    const s7 v19 = f36(v2);
    v5[1] = v19;
    const s7 v36 = f36(v11);
    const s7 v58 = f36(v36);
    v12[1] = v58;
    const s7 v85 = f36(v58);
    v5[2] = v85;
    return v85;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    s7 v4 = v0;
    s7 v3 = v4;
    const s7 v6 = f4(v0);
    const std::vector<std::vector<s1>> v5 = v6.p0;
    v4.p0 = v5;
    v3.p0 = v5;
    const s7 v11 = f4(v3);
    const s0 v12 = v11.p1;
    const std::vector<std::vector<double>> v10 = v12.p1;
    v3.p1 = v12;
    const s0 v54 = v6.p1;
    v4.p1 = v54;
    v4.p1 = v54;
    const std::vector<double> v41 = v10[0];
    const double v49 = v41[0];
    return v49;
  }
  int main() {
    s7 v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } }, { { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } }, { { { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } } } } }, { { { 27.0 }, { 28.0 } }, { { 29.0 } } } });
    double v1(30.0);
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
