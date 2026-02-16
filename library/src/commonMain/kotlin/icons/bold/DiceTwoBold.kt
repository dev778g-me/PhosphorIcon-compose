package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.DiceTwoBold: ImageVector
    get() {
        if (_DiceTwoBold != null) {
            return _DiceTwoBold!!
        }
        _DiceTwoBold = ImageVector.Builder(
            name = "Bold.DiceTwoBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 40f)
                lineTo(192f, 40f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 64f)
                lineTo(216f, 192f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 216f)
                lineTo(64f, 216f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
                lineTo(40f, 64f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 40f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(104f, 104f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 152f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
        }.build()

        return _DiceTwoBold!!
    }

@Suppress("ObjectPropertyName")
private var _DiceTwoBold: ImageVector? = null
