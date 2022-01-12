  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v5: [[Double]] = v0.p0
    let v7: [Double] = v5[0]
    var v18: Double = v1
    let v12: Double = v7[0]
    let v4: [[Double]] = v0.p1
    let v30: [Double] = v4[1]
    let v20: Double = v30[0]
    let v24: [Double] = [v18, v18, v20]
    var v31: [Double] = v24
    let v45: Double = v7[0]
    let v56: Double = v31[1]
    let v108: Double = v45 * v56
    v18 = v12
    var v140: Double = v108
    return v140
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
