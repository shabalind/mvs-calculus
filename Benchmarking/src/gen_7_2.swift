  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
    var p2: [s0]
    var p3: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  struct s3 {
    var p0: s1
    var p1: s2
  }
  func f17(_ v0: s1) -> s1 {
    var v3: s1 = v0
    let v2: s0 = v3.p1
    let v1: s0 = v0.p1
    var v12: s0 = v2
    var v5: s1 = v3
    v3.p1 = v1
    var v9: s0 = v2
    v5.p3 = v1
    v9 = v12
    let v7: Double = v2.p0
    v12.p0 = v7
    v3.p1 = v9
    v5 = v0
    return v5
  }
  func f6(_ v0: s3) -> s3 {
    let v2: [s3] = [v0, v0, v0, v0, v0]
    var v4: s3 = v0
    let v1: s3 = v2[2]
    let v5: s1 = v4.p0
    let v3: s2 = v1.p1
    let v7: s1 = f17(v5)
    v4 = v0
    let v13: s1 = v3.p1
    v4.p0 = v7
    let v19: s1 = f17(v5)
    let v29: s1 = f17(v19)
    let v40: [s1] = v3.p0
    let v43: s2 = s2(p0: v40, p1: v29)
    v4.p0 = v13
    let v70: s1 = v43.p1
    v4.p0 = v70
    var v67: s3 = v4
    return v67
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v3: s3 = v0
    let v2: s3 = f6(v3)
    let v7: s1 = v2.p0
    v3.p0 = v7
    let v4: s1 = f17(v7)
    let v8: s2 = v0.p1
    let v6: s3 = s3(p0: v7, p1: v8)
    v3.p0 = v7
    v3.p1 = v8
    let v10: s2 = v6.p1
    let v30: s1 = v8.p1
    v3.p1 = v8
    let v25: [s0] = v4.p2
    let v46: s0 = v25[0]
    v3.p0 = v4
    v3.p1 = v10
    v3.p0 = v30
    let v83: Double = v46.p0
    return v83
  }
  func benchmark() {
    let v0: s3 = s3(p0: s1(p0: [[s0(p0: 0.0, p1: [[1.0]])]], p1: s0(p0: 2.0, p1: [[3.0]]), p2: [s0(p0: 4.0, p1: [[5.0]]), s0(p0: 6.0, p1: [[7.0]]), s0(p0: 8.0, p1: [[9.0]])], p3: s0(p0: 10.0, p1: [[11.0]])), p1: s2(p0: [s1(p0: [[s0(p0: 12.0, p1: [[13.0]])]], p1: s0(p0: 14.0, p1: [[15.0]]), p2: [s0(p0: 16.0, p1: [[17.0]]), s0(p0: 18.0, p1: [[19.0]]), s0(p0: 20.0, p1: [[21.0]])], p3: s0(p0: 22.0, p1: [[23.0]])), s1(p0: [[s0(p0: 24.0, p1: [[25.0]])]], p1: s0(p0: 26.0, p1: [[27.0]]), p2: [s0(p0: 28.0, p1: [[29.0]]), s0(p0: 30.0, p1: [[31.0]]), s0(p0: 32.0, p1: [[33.0]])], p3: s0(p0: 34.0, p1: [[35.0]])), s1(p0: [[s0(p0: 36.0, p1: [[37.0]])]], p1: s0(p0: 38.0, p1: [[39.0]]), p2: [s0(p0: 40.0, p1: [[41.0]]), s0(p0: 42.0, p1: [[43.0]]), s0(p0: 44.0, p1: [[45.0]])], p3: s0(p0: 46.0, p1: [[47.0]]))], p1: s1(p0: [[s0(p0: 48.0, p1: [[49.0]])]], p1: s0(p0: 50.0, p1: [[51.0]]), p2: [s0(p0: 52.0, p1: [[53.0]]), s0(p0: 54.0, p1: [[55.0]]), s0(p0: 56.0, p1: [[57.0]])], p3: s0(p0: 58.0, p1: [[59.0]]))))
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
