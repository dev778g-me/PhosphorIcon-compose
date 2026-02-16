package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.WashingMachineBold: ImageVector
    get() {
        if (_WashingMachineBold != null) {
            return _WashingMachineBold!!
        }
        _WashingMachineBold = ImageVector.Builder(
            name = "Bold.WashingMachineBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 80f)
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
                moveTo(44f, 36f)
                lineTo(212f, 36f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 220f, 44f)
                lineTo(220f, 212f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 212f, 220f)
                lineTo(44f, 220f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 212f)
                lineTo(36f, 44f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(132f, 148f)
                lineTo(148f, 132f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108f, 124f)
                lineTo(116f, 116f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(183.33f, 119.32f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -46.66f, -46.65f)
            }
        }.build()

        return _WashingMachineBold!!
    }

@Suppress("ObjectPropertyName")
private var _WashingMachineBold: ImageVector? = null
