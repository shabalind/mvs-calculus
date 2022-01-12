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
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s1 p1;
    double p2;
    s3(std::vector<s1> v0, s1 v1, double v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f66(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<std::vector<double>> v5 = v4.p0;
    const s1 v1(v0, v0);
    v4.p0 = v5;
    const std::vector<double> v3 = v5[0];
    std::vector<double> v6 = v3;
    std::vector<std::vector<double>> v7 = v5;
    v7[0] = v3;
    const std::vector<std::vector<double>> v12 = v4.p1;
    const s0 v2 = v1.p1;
    const std::vector<double> v9 = v7[0];
    const std::vector<std::vector<double>> v19 = v4.p1;
    const std::vector<double> v10 = v7[0];
    std::vector<double> v8 = v10;
    v4.p0 = v7;
    v4.p0 = v5;
    s1 v22 = v1;
    const std::vector<std::vector<double>> v11 = v0.p1;
    const double v15 = v3[0];
    v8[0] = v15;
    const std::vector<std::vector<double>> v50 = v0.p0;
    const std::vector<std::vector<double>> v17 { v3, v9, v6, v3, v10, v9, v8 };
    s1 v36 = v1;
    v7[0] = v8;
    v4.p1 = v5;
    std::vector<std::vector<double>> v25 = v50;
    v6[0] = v15;
    v22.p1 = v2;
    const s0 v30 = v22.p1;
    const std::vector<double> v33 = v19[0];
    const s0 v41 = v22.p0;
    v22.p1 = v0;
    const s0 v29(v12, v12);
    v22.p1 = v29;
    const s0 v31 = v36.p0;
    const std::vector<double> v21 = v5[0];
    v25[0] = v33;
    v22.p0 = v4;
    v22.p0 = v31;
    v36.p0 = v30;
    const std::vector<std::vector<double>> v23 = v30.p0;
    v36.p0 = v30;
    const std::vector<double> v49 = v17[3];
    const double v45 = v49[0];
    v4.p1 = v23;
    const s0 v39(v25, v5);
    s0 v47 = v41;
    const s0 v56 = v36.p0;
    const s0 v55 = v1.p1;
    const std::vector<std::vector<double>> v40 = v47.p1;
    v25[0] = v21;
    v36.p0 = v55;
    v4.p0 = v40;
    v36.p1 = v39;
    const s2 v66(v22, v56);
    const s0 v92 = v66.p1;
    v22.p0 = v2;
    v4.p1 = v5;
    v36.p0 = v4;
    v4.p1 = v11;
    v4.p0 = v11;
    v8[0] = v45;
    return v92;
  }
  s1 f60(const s1 &v0) {
    const s0 v2 = v0.p1;
    s1 v4 = v0;
    const s0 v3 = f66(v2);
    const std::vector<std::vector<double>> v11 = v3.p1;
    s0 v8 = v3;
    v8.p0 = v11;
    const s0 v21 = f66(v8);
    s1 v39 = v4;
    v4 = v0;
    v4.p1 = v21;
    const s0 v44 = f66(v2);
    const s0 v52 = v4.p1;
    v39.p0 = v21;
    v4.p0 = v44;
    const s2 v113(v39, v52);
    const s1 v138 = v113.p0;
    return v138;
  }
  s1 f53(const s1 &v0, const s1 &v1) {
    const s1 v5 = f60(v0);
    const s1 v3 = f60(v5);
    s1 v7 = v1;
    const s0 v6 = v7.p0;
    const std::vector<std::vector<double>> v8 = v6.p1;
    v7.p1 = v6;
    s0 v9 = v6;
    v9.p0 = v8;
    v9.p0 = v8;
    v9.p0 = v8;
    s0 v10 = v6;
    v7.p0 = v9;
    const std::vector<std::vector<double>> v26 = v10.p0;
    const s0 v37 = f66(v6);
    const s0 v36 = v3.p1;
    v7.p1 = v10;
    const s1 v38(v36, v37);
    v9.p1 = v26;
    return v38;
  }
  s1 f47(const s1 &v0) {
    const s1 v4 = f53(v0, v0);
    const s1 v3 = f60(v0);
    const s0 v7 = v0.p1;
    s0 v5 = v7;
    const std::vector<std::vector<double>> v2 = v7.p0;
    const std::vector<std::vector<double>> v10 = v7.p1;
    const s0 v6 = f66(v5);
    s1 v11 = v0;
    const s0 v8 = f66(v7);
    v5 = v6;
    const s1 v16 = f53(v3, v4);
    s0 v12 = v8;
    const s0 v25 = v0.p1;
    v12.p0 = v10;
    s1 v13 = v11;
    v12.p0 = v10;
    v5.p0 = v2;
    v5.p1 = v2;
    const s1 v14 = f53(v0, v16);
    const s0 v36 = v14.p1;
    v13.p0 = v6;
    s1 v33 = v13;
    s0 v21 = v6;
    const s1 v68 = f53(v4, v33);
    const s0 v39 = v33.p0;
    const s1 v32 = f53(v68, v13);
    const s0 v93 = v3.p0;
    v11.p0 = v12;
    const s0 v47 = v16.p0;
    v33.p1 = v36;
    v13.p1 = v93;
    v33.p0 = v21;
    v5 = v47;
    v33.p0 = v39;
    v11.p1 = v25;
    return v32;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const std::vector<s0> &v1, const double &v2) {
    std::vector<s0> v11 = v1;
    const s0 v9 = v11[1];
    const s0 v13 = f66(v9);
    const s1 v21(v13, v13);
    const s1 v17 = f53(v21, v21);
    const s1 v25 = f47(v17);
    s1 v35 = v25;
    const s0 v53 = v1[1];
    v11[1] = v9;
    v35.p1 = v13;
    const s0 v60 = v35.p0;
    const std::vector<std::vector<double>> v32 = v60.p1;
    v11[1] = v53;
    v11[1] = v13;
    const std::vector<double> v54 = v32[0];
    const double v174 = v54[0];
    return v174;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } } }, { { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } }, 16.0 }, { { { { { { 17.0 } }, { { 18.0 } } }, { { { 19.0 } }, { { 20.0 } } } }, { { { { 21.0 } }, { { 22.0 } } }, { { { 23.0 } }, { { 24.0 } } } }, { { { { 25.0 } }, { { 26.0 } } }, { { { 27.0 } }, { { 28.0 } } } } }, { { { { 29.0 } }, { { 30.0 } } }, { { { 31.0 } }, { { 32.0 } } } }, 33.0 } });
    std::vector<s0> v1({ { { { 34.0 } }, { { 35.0 } } }, { { { 36.0 } }, { { 37.0 } } } });
    double v2(38.0);
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
