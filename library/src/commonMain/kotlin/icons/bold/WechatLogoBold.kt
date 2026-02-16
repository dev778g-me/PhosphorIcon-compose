package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.WechatLogoBold: ImageVector
    get() {
        if (_WechatLogoBold != null) {
            return _WechatLogoBold!!
        }
        _WechatLogoBold = ImageVector.Builder(
            name = "Bold.WechatLogoBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 144f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 144f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 224f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 63.5f, -38f)
                lineToRelative(8.16f, 27.76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.93f, 9.93f)
                lineTo(194f, 215.5f)
                arcTo(71.75f, 71.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 224f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92.06f, 175.89f)
                arcToRelative(71.53f, 71.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -30f, -8.39f)
                lineToRelative(-27.76f, 8.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.93f, -9.93f)
                lineTo(32.5f, 138f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 163.94f, 80.11f)
            }
        }.build()

        return _WechatLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _WechatLogoBold: ImageVector? = null
