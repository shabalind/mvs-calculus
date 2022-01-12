  import Dispatch
  struct s0 {
    var p0: Double
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s7 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s8 {
    var p0: s7
    var p1: s7
    var p2: s1
    var p3: [[s2]]
  }
  struct s9 {
    var p0: [s0]
    var p1: [s8]
  }
  func f8(_ v0: Double) -> Double {
    var v3: Double = v0
    var v4: Double = v0
    var v5: Double = v0
    var v1: Double = v3
    var v7: Double = v4
    v3 = v5
    var v6: Double = v7
    let v2: s0 = s0(p0: v5)
    var v9: Double = v0
    var v14: Double = v7
    var v10: s0 = v2
    var v18: Double = v14
    let v28: Double = v10.p0
    let v11: Double = v2.p0
    v10.p0 = v1
    v10.p0 = v11
    v6 = v14
    v10.p0 = v0
    let v30: s0 = s0(p0: v5)
    var v21: Double = v1
    let v40: Double = v30.p0
    v10.p0 = v18
    v10.p0 = v18
    let v25: Double = v2.p0
    let v42: [Double] = [v6, v28, v21, v9, v40, v14]
    var v66: [Double] = v42
    let v55: Double = v66[3]
    let v64: Double = v66[3]
    v14 = v55
    v4 = v25
    return v64
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: Double) -> Double {
    var v5: Double = v1
    v5 = v1
    let v9: Double = f8(v5)
    var v14: Double = v5
    var v20: Double = v14
    let v54: Double = f8(v20)
    let v37: Double = f8(v54)
    let v45: Double = v37 + v9
    let v46: Double = f8(v45)
    return v46
  }
  func benchmark() {
    let v0: s9 = s9(p0: [s0(p0: 0.0), s0(p0: 1.0), s0(p0: 2.0)], p1: [s8(p0: s7(p0: [s0(p0: 3.0), s0(p0: 4.0)], p1: [s0(p0: 5.0)]), p1: s7(p0: [s0(p0: 6.0), s0(p0: 7.0)], p1: [s0(p0: 8.0)]), p2: s1(p0: [[s0(p0: 9.0)]], p1: [s0(p0: 10.0), s0(p0: 11.0), s0(p0: 12.0)]), p3: [[s2(p0: s0(p0: 13.0), p1: [s0(p0: 14.0), s0(p0: 15.0), s0(p0: 16.0)])]]), s8(p0: s7(p0: [s0(p0: 17.0), s0(p0: 18.0)], p1: [s0(p0: 19.0)]), p1: s7(p0: [s0(p0: 20.0), s0(p0: 21.0)], p1: [s0(p0: 22.0)]), p2: s1(p0: [[s0(p0: 23.0)]], p1: [s0(p0: 24.0), s0(p0: 25.0), s0(p0: 26.0)]), p3: [[s2(p0: s0(p0: 27.0), p1: [s0(p0: 28.0), s0(p0: 29.0), s0(p0: 30.0)])]])])
    let v1: Double = 31.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 31.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
