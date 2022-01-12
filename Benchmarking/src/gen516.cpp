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
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    s0 p1;
    s4(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f74(const std::vector<s0> &v0) {
    const s0 v7 = v0[1];
    const std::vector<std::vector<double>> v5 = v7.p1;
    const std::vector<std::vector<double>> v4 = v7.p0;
    const s0 v2 = v0[1];
    s0 v10 = v7;
    const s0 v17 = v0[0];
    const std::vector<std::vector<double>> v12 = v10.p0;
    s0 v8 = v10;
    std::vector<s0> v11 = v0;
    v8.p0 = v4;
    const std::vector<std::vector<double>> v21 = v17.p0;
    const s0 v27 = v11[1];
    const std::vector<std::vector<double>> v32 = v8.p0;
    const std::vector<std::vector<double>> v19 = v7.p1;
    v10.p1 = v5;
    v8.p1 = v19;
    const s0 v18 = v11[1];
    const std::vector<std::vector<double>> v36 = v2.p1;
    v10.p0 = v32;
    v10.p0 = v21;
    const s1 v24(v0, v11);
    const std::vector<std::vector<double>> v56 = v10.p0;
    const std::vector<std::vector<s0>> v51 { v0, v0, v11, v11 };
    v11[0] = v10;
    const std::vector<s0> v40 = v24.p1;
    v10.p0 = v4;
    v8.p0 = v12;
    const s1 v35(v11, v40);
    const std::vector<std::vector<double>> v43 = v18.p1;
    v8.p1 = v36;
    std::vector<std::vector<s0>> v77 = v51;
    s1 v50 = v24;
    v50 = v35;
    v8.p1 = v36;
    const std::vector<std::vector<std::vector<s0>>> v92 { v51, v77 };
    std::vector<std::vector<std::vector<s0>>> v54 = v92;
    const std::vector<std::vector<double>> v82 = v27.p1;
    v8.p0 = v56;
    v50.p1 = v40;
    const std::vector<std::vector<s0>> v87 = v54[0];
    v10.p1 = v82;
    const std::vector<s0> v155 = v87[3];
    const std::vector<s0> v125 = v24.p0;
    const std::vector<std::vector<s0>> v118 = v92[1];
    v50.p1 = v0;
    v8.p0 = v12;
    v77[2] = v155;
    v8.p0 = v4;
    v10.p0 = v4;
    v54[0] = v87;
    v8.p1 = v43;
    const std::vector<s0> v136 = v50.p0;
    v54[1] = v118;
    v50.p0 = v125;
    v50.p0 = v155;
    v8.p0 = v4;
    return v136;
  }
  s0 f70(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p1;
    std::vector<std::vector<double>> v2 = v7;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<double> v10 = v7[1];
    v2[2] = v10;
    std::vector<double> v9 = v10;
    const double v4 = v9[0];
    const std::vector<double> v1 = v2[0];
    v2[1] = v9;
    v2[2] = v10;
    v9[0] = v4;
    const std::vector<double> v8 = v6[0];
    v2[1] = v1;
    const std::vector<std::vector<double>> v28 = v0.p0;
    const std::vector<double> v35 = v7[1];
    v2 = v7;
    const std::vector<std::vector<double>> v31 = v0.p0;
    std::vector<std::vector<double>> v19 = v31;
    const std::vector<std::vector<double>> v29 = v0.p1;
    v19[1] = v1;
    const std::vector<double> v21 = v28[0];
    std::vector<std::vector<double>> v25 = v31;
    s0 v46 = v0;
    std::vector<double> v45 = v8;
    std::vector<std::vector<double>> v43 = v25;
    std::vector<std::vector<double>> v53 = v43;
    const std::vector<double> v58 = v28[0];
    const std::vector<std::vector<std::vector<double>>> v67 { v29 };
    v46.p1 = v29;
    std::vector<std::vector<std::vector<double>>> v40 = v67;
    v43[0] = v21;
    v46.p0 = v28;
    v46.p0 = v19;
    std::vector<std::vector<std::vector<double>>> v206 = v40;
    v40 = v67;
    v2[2] = v58;
    std::vector<std::vector<double>> v77 = v2;
    const double v55 = v35[0];
    v45[0] = v55;
    v46.p1 = v77;
    v46.p1 = v29;
    v25[1] = v45;
    const std::vector<std::vector<double>> v100 = v206[0];
    v46.p0 = v53;
    v46.p1 = v100;
    return v46;
  }
  std::vector<s2> f61(const std::vector<s2> &v0) {
    std::vector<s2> v1 = v0;
    std::vector<s2> v5 = v0;
    std::vector<s2> v7 = v1;
    v7 = v5;
    return v7;
  }
  s1 f44(const s1 &v0) {
    s1 v7 = v0;
    const std::vector<s1> v2 { v7, v7, v7, v7, v0 };
    v7 = v0;
    const std::vector<s0> v6 = v0.p0;
    std::vector<s1> v8 = v2;
    v7 = v0;
    v8[3] = v7;
    v8[1] = v7;
    const std::vector<s0> v4 = v0.p1;
    v8[0] = v7;
    std::vector<s1> v10 = v2;
    const std::vector<s0> v14 = v0.p1;
    std::vector<s1> v3 = v10;
    const s1 v12 = v8[2];
    const std::vector<s0> v25 = f74(v6);
    v7.p1 = v4;
    std::vector<s0> v17 = v14;
    v3[0] = v12;
    v10[3] = v12;
    v10 = v2;
    v3[1] = v7;
    v17 = v6;
    std::vector<s1> v35 = v3;
    const s1 v36 = v35[2];
    std::vector<s1> v40 = v2;
    s1 v82 = v36;
    v82.p1 = v17;
    const s1 v46 = v40[3];
    v3 = v8;
    v3[2] = v46;
    v7.p1 = v25;
    return v82;
  }
  s2 f1(const s2 &v0) {
    const s1 v6 = v0.p1;
    const s1 v5 = f44(v6);
    const s1 v4 = f44(v5);
    const std::vector<s0> v9 = v4.p0;
    std::vector<s0> v2 = v9;
    const s0 v3 = v9[1];
    s1 v8 = v5;
    const std::vector<s0> v11 = v8.p1;
    const s0 v15 = v11[0];
    const s2 v10(v11, v8);
    const std::vector<s0> v13 = f74(v2);
    s2 v24 = v10;
    v8.p0 = v11;
    v8.p0 = v11;
    v8.p1 = v11;
    v2[1] = v15;
    const s0 v20 = v9[0];
    v2[0] = v20;
    v2[1] = v3;
    v24.p0 = v9;
    v24.p0 = v13;
    return v24;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const double &v1) {
    std::vector<std::vector<s2>> v6 = v0;
    std::vector<std::vector<s2>> v4 = v6;
    const std::vector<s2> v3 = v4[0];
    const std::vector<s2> v2 = f61(v3);
    const std::vector<s2> v10 = f61(v2);
    const s2 v5 = v2[0];
    const s2 v13 = f1(v5);
    const s2 v15 = f1(v13);
    v6[0] = v3;
    const std::vector<s2> v11 = v4[1];
    const std::vector<s0> v30 = v5.p0;
    v6[1] = v10;
    v6[1] = v11;
    const std::vector<s0> v21 = v5.p0;
    const s1 v14(v21, v21);
    std::vector<s0> v17 = v30;
    const s0 v16 = v17[0];
    const s4 v18(v15, v16);
    const s0 v20 = f70(v16);
    const std::vector<std::vector<double>> v22 = v20.p1;
    const s2 v34 = v18.p0;
    const std::vector<s0> v19 = v14.p0;
    const std::vector<s2> v23 = v4[0];
    std::vector<s2> v35 = v23;
    v17[1] = v20;
    v4[0] = v35;
    v35 = v3;
    const std::vector<std::vector<double>> v44 = v16.p0;
    const std::vector<double> v67 = v22[1];
    std::vector<s0> v93 = v19;
    const std::vector<double> v62 = v44[0];
    const double v82 = v67[0];
    v93[1] = v16;
    const s0 v73 = v93[0];
    v6 = v4;
    v4[1] = v11;
    const double v149 = v62[0];
    const double v101 = v149 * v82;
    v35[0] = v5;
    v35[0] = v34;
    v17[1] = v73;
    return v101;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } } }, { { { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } }, { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } }, { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } } } });
    double v1(60.0);
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
