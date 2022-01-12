  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s2(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f17(const s0 &v0) {
    s0 v6 = v0;
    v6 = v0;
    const std::vector<s0> v7 { v0, v6, v6, v6, v0, v6, v0 };
    std::vector<s0> v9 = v7;
    const s0 v4 = v7[4];
    const std::vector<std::vector<double>> v8 = v4.p0;
    s0 v2 = v0;
    v9[2] = v2;
    const std::vector<std::vector<double>> v1 = v0.p1;
    s0 v11 = v4;
    v11 = v4;
    s0 v13 = v4;
    v6 = v13;
    const s0 v21(v1, v1);
    s0 v14 = v11;
    const std::vector<std::vector<s0>> v25 { v7, v9, v7, v7 };
    v9[5] = v11;
    std::vector<std::vector<s0>> v17 = v25;
    v9[1] = v21;
    const std::vector<s0> v18 = v17[3];
    std::vector<std::vector<double>> v30 = v8;
    const std::vector<double> v22 = v1[0];
    const std::vector<std::vector<double>> v36 = v6.p1;
    v2.p1 = v30;
    const std::vector<std::vector<double>> v67 = v2.p0;
    v6.p0 = v1;
    v13.p0 = v67;
    v9 = v7;
    const std::vector<std::vector<double>> v20 = v21.p1;
    const std::vector<std::vector<double>> v43 = v14.p0;
    v9[0] = v13;
    std::vector<s0> v51 = v18;
    const s0 v23 = v51[3];
    std::vector<std::vector<double>> v35 = v8;
    const std::vector<std::vector<double>> v74 = v4.p1;
    v2.p0 = v43;
    v35[1] = v22;
    const std::vector<std::vector<double>> v54 = v4.p1;
    v11.p1 = v35;
    s0 v86 = v23;
    const s0 v77(v74, v54);
    v86.p1 = v36;
    std::vector<s0> v94 = v51;
    v6.p0 = v20;
    v86.p1 = v35;
    v17[2] = v94;
    v6 = v77;
    return v86;
  }
  s0 f12(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<double> v5 = v3[2];
    const s0 v8 = f17(v0);
    const std::vector<std::vector<double>> v4 = v8.p0;
    s0 v6 = v0;
    v6.p1 = v4;
    const std::vector<double> v12 = v3[1];
    const s0 v1 = f17(v0);
    const s0 v7 = f17(v1);
    const s0 v13 = f17(v6);
    const std::vector<double> v27 = v4[2];
    v6.p1 = v4;
    const double v11 = v5[0];
    const std::vector<std::vector<double>> v24 = v1.p1;
    std::vector<double> v18 = v12;
    const std::vector<std::vector<double>> v30 = v8.p0;
    const std::vector<double> v21 = v30[0];
    const s0 v29 = f17(v7);
    s0 v50 = v1;
    const std::vector<std::vector<double>> v15 = v8.p1;
    const std::vector<std::vector<double>> v34 = v29.p1;
    const std::vector<double> v37 = v4[1];
    v6.p1 = v24;
    std::vector<std::vector<double>> v47 = v34;
    v6.p1 = v24;
    v50.p1 = v47;
    v47[2] = v5;
    v50.p0 = v47;
    v6.p0 = v15;
    s0 v53 = v13;
    const std::vector<std::vector<double>> v41 = v53.p0;
    v18[0] = v11;
    std::vector<std::vector<double>> v70 = v30;
    const std::vector<double> v36 = v70[2];
    const std::vector<double> v49 = v4[0];
    v50.p0 = v30;
    const std::vector<std::vector<double>> v63 { v21, v37, v5, v18, v21, v12, v36 };
    const std::vector<double> v197 = v63[4];
    const s0 v124 = f17(v50);
    v47[1] = v197;
    const std::vector<std::vector<double>> v69 = v1.p1;
    const s0 v77 = f17(v6);
    v47[1] = v5;
    v47[1] = v27;
    v53.p0 = v34;
    const std::vector<std::vector<double>> v148 = v77.p1;
    const s0 v156 = f17(v124);
    const std::vector<std::vector<double>> v242 = v156.p0;
    const s0 v108(v242, v41);
    v53.p0 = v148;
    v6.p1 = v69;
    v70[2] = v49;
    return v108;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v6 = v0[1];
    const s2 v4 = v0[1];
    const s0 v5 = v4.p1;
    const double v14 = v1 / v1;
    const s0 v7 = v6.p1;
    s0 v19 = v5;
    const std::vector<std::vector<double>> v29 = v7.p0;
    const s0 v12 = f17(v19);
    const s0 v70 = f12(v19);
    const std::vector<std::vector<double>> v33 = v70.p0;
    const s2 v39 = v0[0];
    std::vector<std::vector<double>> v45 = v29;
    const std::vector<double> v52 = v33[0];
    std::vector<double> v41 = v52;
    v19.p1 = v45;
    const s0 v74 = v39.p1;
    const std::vector<std::vector<double>> v47 = v74.p0;
    std::vector<double> v99 = v41;
    v41[0] = v14;
    s0 v62 = v19;
    v19.p0 = v45;
    const std::vector<std::vector<double>> v122 = v12.p0;
    v62.p0 = v122;
    const double v87 = v41[0];
    v62.p1 = v47;
    const std::vector<double> v148 { v87, v14 };
    v45[2] = v99;
    const double v108 = v148[1];
    v19 = v62;
    return v108;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } });
    double v1(36.0);
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
