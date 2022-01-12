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
    std::vector<std::vector<s0>> p2;
    s0 p3;
    s1(std::vector<s0> v0, s0 v1, std::vector<std::vector<s0>> v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s3 {
    std::vector<std::vector<s0>> p0;
    s3(std::vector<std::vector<s0>> v0): p0(v0) { }
  };
  s0 f84(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<double>> v6 = v0.p0;
    s0 v3 = v0;
    v3 = v0;
    const std::vector<double> v1 = v2[1];
    v3.p0 = v6;
    std::vector<std::vector<double>> v11 = v6;
    v3.p1 = v2;
    const std::vector<double> v13 = v2[0];
    v11[0] = v13;
    v3.p0 = v5;
    const std::vector<std::vector<double>> v25 = v3.p0;
    const std::vector<std::vector<double>> v14 = v3.p1;
    const std::vector<double> v16 = v2[2];
    s0 v18 = v3;
    const std::vector<double> v36 = v6[0];
    v11[0] = v13;
    std::vector<std::vector<double>> v33 = v25;
    v3 = v0;
    const std::vector<double> v32 = v25[0];
    const std::vector<std::vector<double>> v51 = v3.p1;
    v3.p0 = v11;
    v3 = v18;
    std::vector<std::vector<double>> v42 = v51;
    s0 v67 = v3;
    v11[0] = v16;
    std::vector<std::vector<double>> v35 = v33;
    std::vector<std::vector<double>> v94 = v11;
    const std::vector<std::vector<double>> v44 = v18.p0;
    v3.p1 = v2;
    const std::vector<std::vector<double>> v45 = v3.p1;
    v3.p0 = v6;
    v18.p0 = v25;
    v18.p1 = v42;
    v67.p0 = v11;
    const std::vector<std::vector<double>> v77 = v0.p1;
    v3.p1 = v77;
    v35[0] = v36;
    v18.p0 = v6;
    v3.p1 = v77;
    v67.p1 = v45;
    v67.p1 = v14;
    const std::vector<std::vector<double>> v92 = v3.p0;
    const std::vector<double> v52 = v35[0];
    v3.p0 = v92;
    std::vector<std::vector<double>> v97 = v14;
    v67 = v3;
    const std::vector<std::vector<double>> v145 = v0.p1;
    v94[0] = v32;
    v18.p1 = v97;
    const std::vector<std::vector<double>> v74 = v18.p1;
    v67.p1 = v74;
    v11[0] = v52;
    v42[0] = v1;
    v18.p0 = v94;
    const std::vector<std::vector<double>> v85 = v3.p1;
    const std::vector<std::vector<double>> v79 = v18.p0;
    v18.p1 = v145;
    const std::vector<std::vector<double>> v169 = v3.p0;
    s0 v189 = v67;
    v67.p0 = v5;
    v189.p1 = v14;
    v3.p0 = v79;
    const std::vector<double> v174 = v169[0];
    std::vector<std::vector<double>> v228 = v74;
    v3.p1 = v85;
    v11[0] = v174;
    v18.p1 = v228;
    v3.p0 = v44;
    return v189;
  }
  s0 f65(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<double>> v4 = v1.p0;
    const std::vector<std::vector<double>> v6 = v1.p0;
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<std::vector<double>> v10 = v0.p1;
    const std::vector<double> v7 = v4[0];
    std::vector<std::vector<double>> v9 = v10;
    const s0 v11(v6, v9);
    const s0 v17(v4, v10);
    v9[0] = v7;
    const std::vector<std::vector<double>> v16 = v1.p0;
    v9 = v3;
    const std::vector<std::vector<double>> v26 = v17.p0;
    const std::vector<std::vector<double>> v51 = v0.p0;
    s0 v24 = v1;
    v24.p0 = v16;
    const std::vector<double> v34 = v2[0];
    s0 v36 = v24;
    v9[1] = v34;
    v36.p1 = v10;
    s0 v45 = v36;
    const s0 v39(v51, v2);
    v24.p1 = v2;
    const std::vector<std::vector<double>> v48 = v39.p1;
    const s0 v85 = f84(v11);
    const std::vector<std::vector<double>> v137 = v85.p0;
    v24.p0 = v137;
    v45.p0 = v137;
    v36.p1 = v2;
    const std::vector<std::vector<double>> v59 = v45.p0;
    v36.p1 = v9;
    v45.p1 = v48;
    s0 v178 = v1;
    v178.p0 = v59;
    v45.p1 = v3;
    v24.p0 = v26;
    v178.p1 = v9;
    v178.p1 = v48;
    const s0 v242 = f84(v178);
    return v242;
  }
  s0 f45(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v2 = v0.p0;
    const s0 v3 = f65(v1, v1);
    const std::vector<std::vector<double>> v5 = v0.p1;
    const s0 v6(v2, v5);
    s0 v10 = v0;
    const std::vector<std::vector<double>> v9 = v3.p0;
    v10.p0 = v9;
    const s0 v13 = f84(v1);
    const std::vector<std::vector<double>> v12 = v13.p1;
    v10.p1 = v12;
    v10.p1 = v5;
    v10.p0 = v9;
    const std::vector<std::vector<double>> v42 = v6.p0;
    v10.p1 = v5;
    v10.p0 = v2;
    s0 v29 = v3;
    v10.p0 = v42;
    const s0 v23 = f65(v10, v29);
    return v23;
  }
  s0 f40(const s0 &v0, const s3 &v1) {
    s0 v3 = v0;
    const s0 v2 = f45(v3, v0);
    const s0 v11 = f45(v3, v2);
    const s0 v4 = f45(v3, v2);
    const std::vector<std::vector<double>> v12 = v3.p0;
    const std::vector<double> v10 = v12[0];
    const std::vector<double> v16 = v12[0];
    s0 v13 = v3;
    v3 = v0;
    std::vector<std::vector<double>> v14 = v12;
    std::vector<double> v33 = v16;
    v14[0] = v16;
    const std::vector<std::vector<double>> v17 = v3.p1;
    const std::vector<double> v25 = v17[0];
    v3.p0 = v14;
    v14[0] = v16;
    const std::vector<std::vector<double>> v26 = v13.p1;
    const std::vector<double> v29 = v12[0];
    const double v20 = v29[0];
    const std::vector<std::vector<double>> v37 = v2.p0;
    const std::vector<std::vector<double>> v31 = v4.p1;
    const s0 v57 = f65(v0, v3);
    v14[0] = v25;
    const s0 v71 = f45(v11, v13);
    v13.p1 = v31;
    std::vector<std::vector<double>> v123 = v26;
    v123[0] = v29;
    s0 v101 = v71;
    v33[0] = v20;
    v14[0] = v10;
    s0 v139 = v13;
    v139 = v13;
    v13.p1 = v123;
    v139.p0 = v12;
    const s0 v116 = f45(v57, v139);
    v14[0] = v33;
    const std::vector<std::vector<double>> v175 = v101.p1;
    v101.p0 = v37;
    v139.p1 = v175;
    return v116;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const s0 &v1, const s1 &v2, const double &v3) {
    s3 v13 = v0;
    s0 v16 = v1;
    const std::vector<std::vector<s0>> v49 = v13.p0;
    const s0 v38 = f40(v16, v13);
    const s0 v47 = f65(v38, v1);
    v13.p0 = v49;
    const std::vector<std::vector<double>> v77 = v47.p1;
    const std::vector<double> v32 = v77[0];
    const double v63 = v32[0];
    return v63;
  }
  int main() {
    s3 v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } } });
    s0 v1({ { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } });
    s1 v2({ { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } }, { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } });
    double v3(36.0);
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
