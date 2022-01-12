  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: Double) -> Double {
    let v6: s0 = v0[0]
    let v4: [[Double]] = v6.p2
    let v7: [[Double]] = v1.p0
    let v13: [Double] = v4[1]
    let v14: Double = v13[0]
    let v21: [Double] = v7[0]
    var v16: Double = v14
    let v28: Double = v21[0]
    let v34: Double = v28 * v14
    let v207: [Double] = [v28, v34, v2, v16, v34, v16]
    let v91: Double = v207[1]
    return v91
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0]], p3: [[7.0], [8.0], [9.0]], p4: [[10.0], [11.0]])]
    let v1: s0 = s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0]], p2: [[17.0], [18.0]], p3: [[19.0], [20.0], [21.0]], p4: [[22.0], [23.0]])
    let v2: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
