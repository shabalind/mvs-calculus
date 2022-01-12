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
    std::vector<std::vector<s0>> p1;
    s5(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s5 p0;
    std::vector<s5> p1;
    s8(s5 v0, std::vector<s5> v1): p0(v0), p1(v1) { }
  };
  s0 f116(const s0 &v0) {
    s0 v7 = v0;
    v7 = v0;
    s0 v5 = v7;
    const std::vector<std::vector<double>> v2 = v5.p1;
    v5.p1 = v2;
    const std::vector<double> v1 = v2[1];
    const std::vector<std::vector<double>> v6 = v7.p0;
    const std::vector<double> v4 = v2[0];
    const std::vector<std::vector<double>> v10 = v0.p0;
    std::vector<std::vector<double>> v15 = v2;
    const std::vector<double> v13 = v6[2];
    std::vector<std::vector<double>> v12 = v6;
    v12[2] = v4;
    std::vector<std::vector<double>> v42 = v15;
    v7 = v0;
    std::vector<std::vector<double>> v21 = v15;
    v12[2] = v4;
    v15[1] = v13;
    const std::vector<double> v22 = v2[1];
    const s0 v44(v10, v42);
    v5.p0 = v6;
    const std::vector<double> v31 = v10[0];
    v42 = v21;
    v15[1] = v1;
    const std::vector<double> v50 = v6[2];
    v7.p0 = v12;
    v12[2] = v31;
    const double v64 = v22[0];
    v15[0] = v50;
    std::vector<double> v81 = v13;
    v81[0] = v64;
    std::vector<std::vector<double>> v61 = v6;
    v21[0] = v81;
    v5.p0 = v61;
    return v44;
  }
  std::vector<s5> f90(const s0 &v0, const std::vector<s5> &v1) {
    std::vector<s5> v8 = v1;
    const s5 v9 = v8[0];
    v8 = v1;
    v8[0] = v9;
    const s5 v7 = v1[0];
    std::vector<s5> v10 = v1;
    v8 = v1;
    const s5 v12 = v10[0];
    v10[0] = v12;
    const s5 v20 = v8[0];
    v10[0] = v7;
    v10[0] = v20;
    v8 = v10;
    return v10;
  }
  std::vector<double> f83(const std::vector<double> &v0) {
    const double v4 = v0[0];
    std::vector<double> v2 = v0;
    const double v9 = v0[0];
    v2[0] = v9;
    const double v5 = v2[0];
    v2[0] = v4;
    const double v6 = v2[0];
    double v13 = v6;
    const double v11 = v2[0];
    const double v24 = v0[0];
    const double v18 = v0[0];
    v2[0] = v11;
    v2[0] = v18;
    const double v10 = v0[0];
    std::vector<double> v8 = v0;
    const std::vector<double> v12 { v6 };
    std::vector<double> v14 = v2;
    const double v21 = v8[0];
    const double v15 = v8[0];
    const double v23 = v14[0];
    const double v17 = v0[0];
    const std::vector<double> v19 { v10, v11, v24, v15, v23, v17, v17 };
    const std::vector<std::vector<double>> v51 { v19, v19, v19, v19, v19 };
    const std::vector<double> v26 = v51[2];
    v14[0] = v6;
    v14[0] = v18;
    v8[0] = v5;
    std::vector<double> v33 = v12;
    const double v37 = v0[0];
    v33[0] = v37;
    v2[0] = v4;
    v33[0] = v21;
    v14[0] = v13;
    const double v44 = v8[0];
    std::vector<double> v38 = v33;
    v14 = v38;
    v14[0] = v10;
    v33[0] = v21;
    const double v60 = v44 - v10;
    const double v48 = v26[5];
    v33[0] = v48;
    v2 = v33;
    v33[0] = v60;
    v2 = v12;
    return v38;
  }
  s5 f75(const s5 &v0) {
    const std::vector<std::vector<s0>> v3 = v0.p1;
    const s0 v2 = v0.p0;
    s0 v7 = v2;
    s0 v8 = v7;
    const std::vector<s5> v1 { v0 };
    std::vector<s5> v6 = v1;
    const std::vector<s0> v10 = v3[0];
    std::vector<std::vector<s0>> v11 = v3;
    const std::vector<std::vector<double>> v5 = v7.p1;
    const std::vector<std::vector<s0>> v12 = v0.p1;
    s5 v35 = v0;
    v11[1] = v10;
    s0 v19 = v2;
    const s5 v17 = v6[0];
    const std::vector<std::vector<s0>> v14 = v35.p1;
    const std::vector<std::vector<double>> v18 = v7.p1;
    s5 v13 = v17;
    const std::vector<double> v30 = v18[1];
    v8.p1 = v18;
    const std::vector<std::vector<s5>> v23 { v6 };
    const s0 v46 = f116(v8);
    std::vector<s0> v16 = v10;
    v13.p0 = v46;
    const s0 v44 = v16[0];
    v6[0] = v17;
    const s5 v58(v7, v11);
    const s0 v24 = f116(v7);
    const std::vector<s0> v39 = v11[2];
    const std::vector<s5> v29 = v23[0];
    const std::vector<std::vector<double>> v31 = v19.p0;
    v13.p1 = v14;
    v11[0] = v16;
    const s0 v47 = v13.p0;
    const s0 v33 = f116(v24);
    const s0 v53 = v0.p0;
    v6[0] = v13;
    v16[0] = v53;
    v8.p1 = v5;
    const std::vector<std::vector<double>> v55 = v33.p1;
    v7.p0 = v31;
    const std::vector<double> v62 = f83(v30);
    const std::vector<std::vector<double>> v56 = v44.p1;
    v11[1] = v16;
    const s0 v40 = f116(v19);
    v19.p0 = v31;
    const s0 v69 = v10[0];
    const s0 v60 = f116(v2);
    v7 = v60;
    const std::vector<std::vector<double>> v78 = v8.p1;
    v13.p1 = v11;
    v6[0] = v13;
    v13.p0 = v44;
    v35.p1 = v12;
    const std::vector<s5> v94 = f90(v53, v29);
    v19.p0 = v31;
    v7 = v2;
    const std::vector<std::vector<s0>> v66 = v58.p1;
    const s5 v83(v47, v66);
    v19.p1 = v56;
    const std::vector<std::vector<double>> v45 = v44.p1;
    const std::vector<std::vector<double>> v96 = v40.p1;
    std::vector<std::vector<double>> v132 = v96;
    v19.p1 = v45;
    v8.p1 = v78;
    v8.p0 = v31;
    v6[0] = v83;
    v8.p1 = v55;
    v16[0] = v46;
    v13.p0 = v69;
    std::vector<std::vector<double>> v70 = v132;
    const s0 v116 = v39[0];
    v132[1] = v62;
    const std::vector<std::vector<double>> v85 = v53.p0;
    const s5 v191 = v94[0];
    const s0 v242 = v17.p0;
    v8.p1 = v56;
    v8 = v242;
    v13 = v0;
    v16[0] = v116;
    v8.p1 = v78;
    v8.p0 = v85;
    v6[0] = v58;
    v7.p1 = v70;
    v6[0] = v191;
    return v83;
  }
  s8 f44(const s8 &v0) {
    const s5 v2 = v0.p0;
    const s5 v5 = v0.p0;
    const std::vector<s5> v1 { v2, v2, v5, v2, v2 };
    const s5 v7 = v1[2];
    const std::vector<s5> v10 = v0.p1;
    const std::vector<std::vector<s5>> v21 { v10, v10, v10, v10 };
    const std::vector<s5> v69 = v21[2];
    const s8 v95(v7, v69);
    s8 v37 = v95;
    return v37;
  }
  s8 f8(const s8 &v0) {
    const std::vector<s5> v4 = v0.p1;
    const s5 v7 = v4[1];
    s8 v6 = v0;
    const s5 v3 = f75(v7);
    std::vector<s5> v2 = v4;
    const s5 v5 = v2[2];
    v6.p0 = v5;
    v6.p0 = v3;
    const s8 v27 = f44(v6);
    return v27;
  }
  __attribute__((noinline))
  double f0(const s8 &v0, const double &v1) {
    const s8 v4 = f8(v0);
    const s8 v6 = f44(v4);
    const s5 v3 = v6.p0;
    const s0 v8 = v3.p0;
    const std::vector<std::vector<double>> v9 = v8.p1;
    const std::vector<double> v13 = v9[1];
    const double v17 = v13[0];
    return v17;
  }
  int main() {
    s8 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } }, { { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } }, { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } } }, { { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } }, { { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } }, { { { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } } } }, { { { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } } }, { { { { 75.0 }, { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } } } } } });
    double v1(80.0);
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
