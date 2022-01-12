  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v7: s0 = v0[0]
    let v6: [[Double]] = v7.p1
    let v3: [Double] = v6[1]
    let v11: [[Double]] = [v3, v3, v3, v3, v3, v3]
    let v52: [Double] = v11[2]
    var v20: [[Double]] = v11
    var v51: [Double] = v52
    var v50: [Double] = v3
    let v140: [Double] = v20[0]
    v20[1] = v50
    let v68: Double = v140[0]
    let v67: Double = v51[0]
    let v304: Double = v68 / v67
    return v304
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])]
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
