  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: [s0], _ v2: s0, _ v3: Double) -> Double {
    let v4: [[Double]] = v2.p0
    let v8: [Double] = v4[0]
    var v13: Double = v3
    let v7: Double = v13 * v13
    let v21: Double = v8[0]
    var v24: Double = v7
    v13 = v7
    v24 = v21
    var v205: Double = v24
    let v136: Double = v205 / v21
    return v136
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])], [s0(p0: [[3.0]], p1: [[4.0], [5.0]])], [s0(p0: [[6.0]], p1: [[7.0], [8.0]])]]
    let v1: [s0] = [s0(p0: [[9.0]], p1: [[10.0], [11.0]])]
    let v2: s0 = s0(p0: [[12.0]], p1: [[13.0], [14.0]])
    let v3: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
