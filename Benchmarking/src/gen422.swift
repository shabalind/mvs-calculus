  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: s0
  }
  struct s5 {
    var p0: s3
    var p1: [s1]
  }
  struct s6 {
    var p0: [s5]
    var p1: Double
  }
  func f32(_ v0: s5) -> s5 {
    var v1: s5 = v0
    return v1
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    let v7: [s5] = v0.p0
    var v14: [s5] = v7
    let v13: s5 = v14[1]
    v14[2] = v13
    let v11: s5 = f32(v13)
    let v25: s6 = s6(p0: v14, p1: v1)
    let v22: s5 = f32(v11)
    v14[2] = v11
    v14[0] = v22
    let v72: Double = v25.p1
    return v72
  }
  func benchmark() {
    let v0: s6 = s6(p0: [s5(p0: s3(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0]])), p1: [s1(p0: s0(p0: [[6.0]], p1: [[7.0]]), p1: s0(p0: [[8.0]], p1: [[9.0]])), s1(p0: s0(p0: [[10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0]])), s1(p0: s0(p0: [[14.0]], p1: [[15.0]]), p1: s0(p0: [[16.0]], p1: [[17.0]]))]), s5(p0: s3(p0: [s0(p0: [[18.0]], p1: [[19.0]]), s0(p0: [[20.0]], p1: [[21.0]])], p1: s0(p0: [[22.0]], p1: [[23.0]])), p1: [s1(p0: s0(p0: [[24.0]], p1: [[25.0]]), p1: s0(p0: [[26.0]], p1: [[27.0]])), s1(p0: s0(p0: [[28.0]], p1: [[29.0]]), p1: s0(p0: [[30.0]], p1: [[31.0]])), s1(p0: s0(p0: [[32.0]], p1: [[33.0]]), p1: s0(p0: [[34.0]], p1: [[35.0]]))]), s5(p0: s3(p0: [s0(p0: [[36.0]], p1: [[37.0]]), s0(p0: [[38.0]], p1: [[39.0]])], p1: s0(p0: [[40.0]], p1: [[41.0]])), p1: [s1(p0: s0(p0: [[42.0]], p1: [[43.0]]), p1: s0(p0: [[44.0]], p1: [[45.0]])), s1(p0: s0(p0: [[46.0]], p1: [[47.0]]), p1: s0(p0: [[48.0]], p1: [[49.0]])), s1(p0: s0(p0: [[50.0]], p1: [[51.0]]), p1: s0(p0: [[52.0]], p1: [[53.0]]))])], p1: 54.0)
    let v1: Double = 55.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 55.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
