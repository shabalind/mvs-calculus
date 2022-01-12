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
  s0 f23(const s0 &v0, const s0 &v1) {
    s0 v7 = v1;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<double> v3 = v4[1];
    v7.p0 = v4;
    const std::vector<std::vector<double>> v13 = v7.p0;
    const double v8 = v3[0];
    v7.p0 = v13;
    std::vector<double> v12 = v3;
    v7.p0 = v13;
    const std::vector<std::vector<double>> v20 = v0.p1;
    const std::vector<std::vector<double>> v27 = v7.p1;
    const std::vector<double> v14 = v4[1];
    v12 = v14;
    const std::vector<std::vector<double>> v23 = v7.p1;
    const std::vector<std::vector<double>> v9 = v0.p0;
    const std::vector<double> v16 = v20[1];
    std::vector<std::vector<double>> v18 = v9;
    v18[1] = v16;
    v7.p0 = v9;
    std::vector<std::vector<double>> v35 = v27;
    const std::vector<double> v24 = v13[1];
    v12[0] = v8;
    s0 v28 = v0;
    s0 v49 = v0;
    s0 v26 = v1;
    v26.p1 = v23;
    v28 = v26;
    const std::vector<double> v25 = v20[1];
    std::vector<std::vector<double>> v43 = v27;
    v49.p0 = v9;
    v49 = v26;
    v28.p1 = v27;
    v43[1] = v12;
    const std::vector<double> v50 = v18[2];
    v35[1] = v25;
    const std::vector<std::vector<double>> v46 = v1.p0;
    std::vector<std::vector<double>> v31 = v46;
    const std::vector<double> v40 = v43[1];
    v28.p0 = v31;
    v31[1] = v40;
    v43[0] = v50;
    v7.p1 = v35;
    v49.p1 = v27;
    const std::vector<s0> v95 { v26, v1, v28, v26, v49 };
    const s0 v114 = v95[0];
    v31[0] = v24;
    return v114;
  }
  s0 f14(const s0 &v0) {
    s0 v3 = v0;
    s0 v4 = v3;
    s0 v7 = v0;
    v7 = v0;
    const std::vector<s0> v5 { v0, v4, v7, v3, v0, v4 };
    const s0 v2 = v5[4];
    const s0 v9 = v5[5];
    const s0 v1 = v5[0];
    const s0 v8 = v5[1];
    const std::vector<std::vector<double>> v10 = v8.p0;
    const s0 v15 = f23(v2, v0);
    const s0 v6 = f23(v15, v15);
    v3.p0 = v10;
    const s0 v14 = f23(v2, v9);
    const s0 v12 = f23(v15, v4);
    const std::vector<std::vector<double>> v20 = v6.p1;
    const std::vector<std::vector<double>> v13 = v1.p1;
    const s0 v21 = f23(v0, v3);
    const s0 v26 = f23(v8, v21);
    v4.p0 = v10;
    std::vector<s0> v30 = v5;
    const s0 v33 = f23(v8, v21);
    const s0 v22 = f23(v6, v7);
    const s0 v24 = f23(v14, v1);
    const s0 v47 = f23(v6, v7);
    std::vector<std::vector<double>> v19 = v20;
    std::vector<std::vector<double>> v37 = v13;
    const s0 v45 = f23(v22, v3);
    const std::vector<std::vector<double>> v38 = v45.p0;
    const s0 v29 = f23(v7, v33);
    v3.p1 = v13;
    v4.p1 = v13;
    const std::vector<std::vector<double>> v25 = v7.p0;
    const s0 v44 = f23(v26, v15);
    const std::vector<std::vector<double>> v40 = v22.p1;
    const s0 v80(v10, v40);
    v3.p0 = v10;
    const s0 v53 = f23(v47, v12);
    const s0 v52 = f23(v47, v4);
    const std::vector<std::vector<double>> v50 = v53.p1;
    const std::vector<std::vector<double>> v42 = v2.p1;
    v4.p1 = v19;
    v7.p0 = v25;
    const std::vector<double> v61 = v10[0];
    v4.p1 = v50;
    v4.p1 = v42;
    const std::vector<std::vector<double>> v109 = v21.p0;
    const s0 v69 = f23(v1, v29);
    const std::vector<std::vector<double>> v96 = v6.p0;
    const std::vector<std::vector<double>> v66 = v52.p1;
    const std::vector<std::vector<double>> v74 = v44.p0;
    v7.p0 = v74;
    const std::vector<std::vector<double>> v122 = v80.p0;
    const s0 v78 = f23(v24, v80);
    v7.p1 = v37;
    const std::vector<std::vector<double>> v104 = v15.p1;
    const s0 v111 = v30[2];
    v3.p1 = v37;
    const s0 v128 = f23(v21, v26);
    v7.p0 = v96;
    v4.p0 = v38;
    const std::vector<std::vector<double>> v212 = v45.p1;
    v3.p0 = v122;
    v19[0] = v61;
    const s0 v87 = f23(v78, v69);
    const s0 v90 = f23(v87, v128);
    v7.p1 = v66;
    v4.p1 = v212;
    const s0 v164 = f23(v111, v90);
    v7.p1 = v212;
    v4.p1 = v104;
    v4.p0 = v109;
    v3.p1 = v212;
    v7.p0 = v10;
    return v164;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v2 = v0[1];
    const std::vector<s0> v19 = v2.p1;
    const s0 v15 = v19[0];
    const std::vector<std::vector<s0>> v18 { v19 };
    s0 v11 = v15;
    const std::vector<std::vector<double>> v28 = v11.p0;
    v11 = v15;
    const std::vector<s0> v43 = v18[0];
    const s0 v69 = f14(v15);
    const std::vector<std::vector<double>> v16 = v69.p0;
    v11.p0 = v28;
    const std::vector<s0> v61 = v18[0];
    v11.p0 = v16;
    const s0 v25 = v61[1];
    const std::vector<std::vector<std::vector<double>>> v42 { v28, v16, v16, v28 };
    v11.p0 = v16;
    const std::vector<std::vector<double>> v93 = v42[2];
    const std::vector<double> v97 = v93[1];
    v11.p0 = v16;
    const double v104 = v97[0];
    const s0 v68 = v43[0];
    v11.p0 = v16;
    const std::vector<std::vector<double>> v81 = v25.p1;
    v11.p1 = v81;
    const std::vector<std::vector<double>> v143 = v25.p1;
    const std::vector<std::vector<double>> v58 = v15.p0;
    v11.p1 = v143;
    const std::vector<std::vector<double>> v180 = v68.p0;
    v11.p0 = v28;
    v11.p0 = v180;
    v11.p0 = v58;
    return v104;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } } });
    double v1(40.0);
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
