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
    std::vector<s0> p1;
    std::vector<std::vector<s0>> p2;
    std::vector<s0> p3;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1, std::vector<std::vector<s0>> v2, std::vector<s0> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    double p1;
    s2(std::vector<std::vector<s1>> v0, double v1): p0(v0), p1(v1) { }
  };
  s2 f69(const s2 &v0, const s2 &v1) {
    s2 v33 = v0;
    return v33;
  }
  s2 f63(const s2 &v0, const s2 &v1) {
    const s2 v4 = f69(v0, v0);
    const double v5 = v0.p1;
    const std::vector<std::vector<s1>> v8 = v4.p0;
    const s2 v6 = f69(v1, v1);
    const std::vector<std::vector<s1>> v9 = v1.p0;
    const s2 v12 = f69(v4, v0);
    const double v18 = v5 - v5;
    const s2 v22 = f69(v0, v6);
    const std::vector<std::vector<s1>> v28 = v22.p0;
    s2 v21 = v6;
    const s2 v27 = f69(v1, v1);
    v21.p0 = v8;
    const s2 v81 = f69(v12, v27);
    v21.p0 = v28;
    v21.p1 = v18;
    const std::vector<std::vector<s1>> v62 = v4.p0;
    v21.p0 = v28;
    v21.p1 = v5;
    const s2 v74 = f69(v81, v27);
    v21.p0 = v62;
    const s2 v67 = f69(v74, v27);
    const s2 v99 = f69(v81, v21);
    v21.p0 = v9;
    const s2 v130 = f69(v67, v99);
    return v130;
  }
  s2 f53(const s2 &v0) {
    const std::vector<s2> v3 { v0, v0 };
    const s2 v10 = v3[0];
    return v10;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    s2 v6 = v0;
    const s2 v9 = f53(v6);
    const std::vector<std::vector<s1>> v8 = v9.p0;
    const s2 v2(v8, v1);
    v6.p1 = v1;
    const s2 v4 = f63(v2, v0);
    const s2 v13 = f53(v4);
    s2 v42 = v4;
    s2 v22 = v4;
    const s2 v38 = f69(v0, v22);
    const double v34 = v42.p1;
    const double v32 = v38.p1;
    v6.p1 = v1;
    v42.p1 = v34;
    const double v36 = v13.p1;
    const std::vector<double> v48 { v1, v34, v36, v32, v32, v36 };
    const double v35 = v48[0];
    return v35;
  }
  int main() {
    s2 v0({ { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } } }, { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } } } }, { { { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } }, { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } } }, { { { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } } }, { { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } } } }, 60.0 });
    double v1(61.0);
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
