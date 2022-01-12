  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: [[s0]], _ v2: Double) -> Double {
    var v8: [[s0]] = v1
    let v4: [s0] = v8[1]
    let v6: s0 = v4[0]
    let v17: [s0] = v8[0]
    let v12: [[Double]] = v6.p0
    let v5: [s0] = v1[1]
    let v14: [Double] = v12[0]
    v8[0] = v5
    v8[1] = v17
    let v34: Double = v14[0]
    v8[1] = v5
    return v34
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]]))], [s1(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]]))]]
    let v1: [[s0]] = [[s0(p0: [[12.0]], p1: [[13.0], [14.0]])], [s0(p0: [[15.0]], p1: [[16.0], [17.0]])]]
    let v2: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
