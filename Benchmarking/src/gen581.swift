  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
    var p2: s0
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s7 {
    var p0: s1
    var p1: [s2]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s7, _ v2: Double) -> Double {
    let v3: [[Double]] = v0.p0
    let v4: [Double] = v3[0]
    var v8: [[Double]] = v3
    v8[0] = v4
    v8 = v3
    v8[0] = v4
    let v18: [Double] = v8[0]
    v8 = v3
    let v34: Double = v18[0]
    var v56: Double = v34
    var v99: Double = v56
    return v99
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0]])
    let v1: s7 = s7(p0: s1(p0: s0(p0: [[3.0]], p1: [[4.0], [5.0]]), p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p2: s0(p0: [[9.0]], p1: [[10.0], [11.0]])), p1: [s2(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0]]), p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]])), s2(p0: s0(p0: [[18.0]], p1: [[19.0], [20.0]]), p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]])), s2(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: s0(p0: [[27.0]], p1: [[28.0], [29.0]]))])
    let v2: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
