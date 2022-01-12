  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s2 f15(const s2 &v0) {
    s2 v4 = v0;
    const s0 v2 = v0.p1;
    s2 v3 = v4;
    const std::vector<std::vector<double>> v7 = v2.p0;
    const s0 v6(v7, v7);
    const std::vector<s2> v9 { v4, v3, v4, v0 };
    const s2 v11 = v9[2];
    const s0 v1 = v4.p1;
    std::vector<s2> v14 = v9;
    std::vector<s2> v19 = v14;
    std::vector<s2> v20 = v19;
    s0 v12 = v6;
    v4.p1 = v6;
    const s2 v13 = v14[0];
    v4.p1 = v12;
    s2 v27 = v11;
    std::vector<std::vector<double>> v21 = v7;
    v4.p1 = v1;
    v19[3] = v0;
    s2 v22 = v3;
    const s2 v48 = v19[0];
    v12.p1 = v21;
    const s0 v33 = v22.p1;
    std::vector<s2> v26 = v20;
    const std::vector<std::vector<double>> v23 = v6.p1;
    const std::vector<double> v49 = v21[0];
    s2 v28 = v13;
    const std::vector<s1> v44 = v4.p0;
    std::vector<s1> v29 = v44;
    v26[0] = v48;
    v28.p1 = v33;
    v26 = v20;
    v21[0] = v49;
    const std::vector<std::vector<double>> v30 = v2.p1;
    v12.p0 = v21;
    const s0 v65 = v27.p1;
    const s0 v43 = v28.p1;
    const std::vector<std::vector<double>> v90 = v43.p1;
    const s2 v68 = v26[0];
    const s2 v45 = v9[1];
    v26[3] = v68;
    v22.p0 = v29;
    v12.p1 = v30;
    v14[2] = v45;
    std::vector<std::vector<double>> v75 = v23;
    v4.p1 = v65;
    v12.p1 = v75;
    v12.p0 = v90;
    v26 = v9;
    return v68;
  }
  s1 f9(const s1 &v0) {
    const std::vector<std::vector<s0>> v2 = v0.p0;
    const std::vector<s0> v1 = v2[1];
    const std::vector<s0> v10 = v2[1];
    const s0 v3 = v1[0];
    s1 v6 = v0;
    const s0 v19 = v0.p1;
    s1 v24 = v6;
    v24.p1 = v19;
    v24.p1 = v19;
    const s0 v26 = v24.p1;
    const std::vector<s1> v18 { v0, v24, v6, v6, v24, v0 };
    const std::vector<std::vector<s0>> v25 = v6.p0;
    const std::vector<std::vector<s0>> v40 = v6.p0;
    std::vector<std::vector<s0>> v39 = v25;
    const s1 v73 = v18[0];
    v6.p0 = v40;
    const s1 v43 = v18[2];
    const s1 v77 = v18[4];
    std::vector<s1> v51 = v18;
    v39[0] = v10;
    v24.p1 = v26;
    const s0 v48 = v43.p1;
    const std::vector<std::vector<s0>> v91 = v24.p0;
    v24.p1 = v19;
    v6.p0 = v39;
    const s1 v41 = v51[3];
    v6.p1 = v48;
    v6.p1 = v26;
    const std::vector<std::vector<s0>> v74 = v73.p0;
    v6.p0 = v74;
    v24.p0 = v2;
    v6.p1 = v3;
    v6.p0 = v91;
    v51[4] = v77;
    return v41;
  }
  std::vector<s1> f8(const std::vector<s1> &v0) {
    std::vector<s1> v3 = v0;
    std::vector<s1> v8 = v3;
    const s1 v7 = v3[0];
    std::vector<s1> v2 = v8;
    v3[0] = v7;
    const s1 v11 = f9(v7);
    const s1 v15 = v8[0];
    v8[0] = v11;
    v8 = v0;
    v2[0] = v15;
    v2[0] = v11;
    return v2;
  }
  s2 f5(const s2 &v0) {
    s2 v1 = v0;
    const std::vector<s1> v3 = v0.p0;
    const s2 v7 = f15(v0);
    s2 v10 = v0;
    v10 = v1;
    v1 = v7;
    v1 = v0;
    s2 v29 = v1;
    const s2 v12 = f15(v10);
    s2 v36 = v29;
    const std::vector<s1> v33 = f8(v3);
    v10.p0 = v3;
    const s2 v40 = f15(v12);
    v10.p0 = v33;
    v1 = v36;
    return v40;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const s2 &v1, const double &v2) {
    const s2 v3 = v0[0];
    const std::vector<s1> v7 = v1.p0;
    s2 v6 = v3;
    const s0 v11 = v6.p1;
    const s2 v5 = f5(v3);
    v6 = v5;
    const std::vector<std::vector<double>> v18 = v11.p1;
    std::vector<s1> v20 = v7;
    const s1 v24 = v20[0];
    const std::vector<double> v14 = v18[1];
    const s0 v44 = v24.p1;
    std::vector<s1> v25 = v7;
    const s1 v40 = v20[0];
    v25[0] = v40;
    const s1 v95 = v20[0];
    const s1 v84 = f9(v95);
    v20[0] = v84;
    v6.p0 = v25;
    const double v122 = v14[0];
    v6.p1 = v44;
    return v122;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } });
    s2 v1({ { { { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } });
    double v2(32.0);
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
