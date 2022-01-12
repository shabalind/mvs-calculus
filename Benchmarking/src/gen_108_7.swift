  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f93(_ v0: s0) -> s0 {
    let v8: [[Double]] = v0.p1
    let v6: [[[Double]]] = [v8, v8, v8, v8, v8]
    let v17: [[Double]] = v6[0]
    var v20: s0 = v0
    v20.p1 = v17
    v20 = v0
    v20.p1 = v17
    return v20
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: s0, _ v3: s0, _ v4: Double) -> Double {
    let v5: s0 = f93(v3)
    let v12: [[Double]] = v5.p1
    let v13: [Double] = v12[0]
    let v42: Double = v13[0]
    return v42
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0]])]
    let v1: [s0] = [s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])]
    let v2: s0 = s0(p0: [[9.0]], p1: [[10.0], [11.0]])
    let v3: s0 = s0(p0: [[12.0]], p1: [[13.0], [14.0]])
    let v4: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
