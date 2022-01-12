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
    s0 p1;
    std::vector<s0> p2;
    s1(s0 v0, s0 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f17(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<s0> v6 { v0, v0, v0, v0, v0 };
    const std::vector<double> v5 = v4[1];
    const std::vector<std::vector<double>> v7 = v0.p1;
    std::vector<s0> v2 = v6;
    const s0 v8(v4, v7);
    const double v1 = v5[0];
    v2[1] = v8;
    std::vector<std::vector<double>> v3 = v7;
    const s0 v16 = v2[2];
    const std::vector<std::vector<double>> v12 = v0.p1;
    std::vector<std::vector<double>> v10 = v3;
    const std::vector<std::vector<double>> v33 = v0.p0;
    const std::vector<double> v13 = v10[0];
    const std::vector<std::vector<double>> v21 = v8.p0;
    std::vector<double> v19 = v13;
    double v15 = v1;
    const double v24 = v1 - v15;
    const std::vector<std::vector<std::vector<double>>> v27 { v3, v3, v7, v7 };
    const std::vector<std::vector<double>> v39 = v8.p1;
    const std::vector<std::vector<double>> v25 = v0.p1;
    const s0 v50(v33, v25);
    const std::vector<std::vector<double>> v23 = v50.p1;
    const std::vector<std::vector<double>> v34 = v27[1];
    std::vector<double> v26 = v5;
    v19[0] = v24;
    v10 = v12;
    const std::vector<std::vector<double>> v44 = v0.p0;
    v19[0] = v1;
    const std::vector<std::vector<double>> v35 = v8.p1;
    std::vector<std::vector<std::vector<double>>> v41 = v27;
    s0 v36 = v16;
    v36.p1 = v23;
    v36.p1 = v35;
    v3[0] = v5;
    v36.p0 = v44;
    const std::vector<std::vector<double>> v52 = v36.p0;
    v3[0] = v19;
    v2[0] = v0;
    const s0 v57(v52, v23);
    v3[0] = v26;
    v26[0] = v15;
    const std::vector<std::vector<double>> v108 = v41[1];
    v41[1] = v108;
    const double v69 = v19[0];
    v26[0] = v69;
    v36.p1 = v34;
    const std::vector<std::vector<double>> v111 = v27[3];
    const s0 v112(v21, v39);
    const std::vector<std::vector<double>> v89 = v112.p1;
    v36.p1 = v108;
    v36.p1 = v7;
    v36.p1 = v89;
    v36.p0 = v52;
    v36.p1 = v10;
    v36.p1 = v111;
    return v57;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v2 = v0[1];
    s1 v6 = v2;
    const s0 v3 = v6.p0;
    v6.p0 = v3;
    const std::vector<std::vector<double>> v5 = v3.p1;
    const s0 v7 = v2.p0;
    v6.p0 = v7;
    const std::vector<double> v13 = v5[0];
    v6.p1 = v3;
    const std::vector<s0> v9 = v6.p2;
    std::vector<s0> v19 = v9;
    s0 v10 = v3;
    v6.p0 = v7;
    const s0 v12 = v9[0];
    const s0 v15 = v19[1];
    v6.p2 = v19;
    const s1 v23 = v0[0];
    s1 v29 = v2;
    std::vector<std::vector<double>> v21 = v5;
    s1 v24 = v23;
    std::vector<s0> v40 = v19;
    s1 v34 = v29;
    v34.p1 = v12;
    v34.p1 = v7;
    v10.p1 = v21;
    v34.p2 = v9;
    const s0 v26 = v34.p0;
    const s0 v35 = v24.p1;
    const s0 v83 = v23.p1;
    v6.p2 = v40;
    v40 = v19;
    v6.p2 = v9;
    const s0 v73 = f17(v26);
    const s0 v17 = f17(v83);
    const double v51 = v13[0];
    const s0 v66 = f17(v83);
    v29.p0 = v17;
    const std::vector<std::vector<double>> v63 = v66.p1;
    v6.p1 = v10;
    v34.p0 = v12;
    v34.p2 = v40;
    v34.p2 = v9;
    v24.p2 = v19;
    v10.p1 = v63;
    const std::vector<std::vector<double>> v107 = v73.p0;
    v10.p0 = v107;
    v40[1] = v15;
    v29.p1 = v35;
    return v51;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } }, { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } } } });
    double v1(32.0);
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
