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
  s0 f22(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    s0 v6 = v0;
    v6.p0 = v5;
    const std::vector<std::vector<double>> v4 = v0.p0;
    v6 = v0;
    const std::vector<std::vector<double>> v7 = v6.p0;
    const std::vector<std::vector<double>> v1 = v0.p0;
    v6.p0 = v4;
    const std::vector<double> v3 = v7[0];
    const std::vector<std::vector<double>> v10 = v6.p1;
    const std::vector<std::vector<double>> v9 = v0.p0;
    s0 v18 = v0;
    const std::vector<std::vector<double>> v13 = v6.p0;
    v6.p0 = v1;
    std::vector<std::vector<double>> v8 = v10;
    s0 v11 = v0;
    v6.p1 = v10;
    const std::vector<double> v25 = v8[1];
    std::vector<double> v23 = v25;
    v8[1] = v3;
    std::vector<std::vector<double>> v12 = v10;
    v6.p0 = v13;
    const std::vector<double> v31 = v12[0];
    v12[0] = v3;
    v12[0] = v23;
    s0 v20 = v6;
    const std::vector<std::vector<double>> v17 = v0.p0;
    std::vector<double> v44 = v3;
    v20.p0 = v17;
    const std::vector<std::vector<double>> v26 = v0.p1;
    v11.p1 = v8;
    v20.p0 = v9;
    const std::vector<std::vector<double>> v36 = v0.p0;
    v20 = v0;
    const s0 v27(v1, v12);
    const std::vector<std::vector<double>> v24 = v18.p0;
    const double v21 = v31[0];
    v11.p0 = v24;
    v20 = v11;
    const std::vector<std::vector<double>> v60 = v18.p1;
    v11 = v0;
    std::vector<double> v38 = v3;
    v12[0] = v44;
    double v54 = v21;
    const std::vector<std::vector<double>> v98 = v0.p0;
    v44[0] = v54;
    v44[0] = v54;
    v11.p1 = v26;
    v23[0] = v21;
    v6.p0 = v98;
    std::vector<double> v65 = v44;
    double v58 = v54;
    v65[0] = v58;
    v12[1] = v31;
    v12[1] = v65;
    const std::vector<s0> v50 { v11 };
    s0 v78 = v27;
    v12[0] = v25;
    s0 v99 = v78;
    const s0 v101 = v50[0];
    const std::vector<std::vector<double>> v86 = v20.p0;
    const std::vector<std::vector<double>> v105 = v18.p1;
    std::vector<s0> v118 = v50;
    v11.p0 = v24;
    v11.p0 = v36;
    v18.p0 = v86;
    v20.p0 = v1;
    const double v144 = v38[0];
    s0 v69 = v20;
    const std::vector<std::vector<double>> v100 = v20.p1;
    v99 = v101;
    v20.p1 = v60;
    v11.p1 = v105;
    const s0 v87 = v118[0];
    const s0 v67 = v50[0];
    v18.p1 = v60;
    v6.p1 = v26;
    const std::vector<std::vector<double>> v113 = v99.p0;
    v20.p1 = v26;
    const std::vector<s0> v103 { v87, v11, v69 };
    v118[0] = v6;
    v65[0] = v144;
    v118[0] = v67;
    v69.p1 = v100;
    v6.p0 = v113;
    std::vector<s0> v194 = v103;
    std::vector<s0> v110 = v194;
    const s0 v135 = v110[2];
    return v135;
  }
  s0 f19(const s0 &v0) {
    const s0 v18 = f22(v0);
    const s0 v9 = f22(v18);
    const s0 v22 = f22(v9);
    const s0 v70 = f22(v22);
    return v70;
  }
  s0 f16(const s0 &v0) {
    const s0 v5 = f22(v0);
    const s0 v2 = f22(v5);
    const s0 v3 = f22(v2);
    const std::vector<std::vector<double>> v6 = v2.p1;
    const std::vector<std::vector<double>> v8 = v2.p1;
    const s0 v4 = f19(v3);
    const std::vector<double> v1 = v8[0];
    std::vector<std::vector<double>> v14 = v8;
    const std::vector<std::vector<double>> v20 = v4.p0;
    s0 v12 = v5;
    v12.p0 = v20;
    v12.p1 = v14;
    std::vector<std::vector<double>> v13 = v20;
    v14[0] = v1;
    v12.p1 = v6;
    const s0 v18(v20, v6);
    const std::vector<std::vector<double>> v29 = v12.p1;
    const s0 v21(v13, v14);
    const s0 v26 = f22(v5);
    s0 v30 = v18;
    const std::vector<std::vector<double>> v48 = v30.p1;
    const std::vector<double> v33 = v13[1];
    const std::vector<std::vector<double>> v73 = v21.p1;
    const std::vector<std::vector<double>> v22 = v30.p0;
    v12.p1 = v73;
    v13[0] = v33;
    s0 v55 = v26;
    const s0 v39 = f22(v55);
    v55.p1 = v29;
    std::vector<std::vector<double>> v90 = v8;
    v55.p0 = v22;
    const s0 v76 = f19(v39);
    const std::vector<std::vector<double>> v102 = v21.p1;
    v30.p1 = v48;
    v55.p1 = v90;
    v30.p1 = v102;
    return v76;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<s1> &v1, const s1 &v2, const double &v3) {
    const std::vector<s0> v4 = v2.p0;
    const s1 v10 = v1[0];
    s1 v11 = v10;
    const std::vector<s0> v13 = v10.p0;
    const s0 v20 = v11.p1;
    v11.p0 = v13;
    v11.p0 = v4;
    const s0 v44 = f16(v20);
    const std::vector<std::vector<double>> v70 = v44.p1;
    const std::vector<double> v56 = v70[0];
    std::vector<double> v128 = v56;
    const double v48 = v128[0];
    return v48;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } });
    std::vector<s1> v1({ { { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } } });
    s1 v2({ { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } });
    double v3(45.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
