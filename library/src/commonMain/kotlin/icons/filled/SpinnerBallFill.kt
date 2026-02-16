package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SpinnerBallFill: ImageVector
    get() {
        if (_SpinnerBallFill != null) {
            return _SpinnerBallFill!!
        }
        _SpinnerBallFill = ImageVector.Builder(
            name = "Filled.SpinnerBallFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(167.11f, 49.19f)
                curveTo(170.24f, 83.71f, 155f, 99.44f, 135f, 113.61f)
                curveToRelative(-2.25f, -24.48f, -8.44f, -49.8f, -38.37f, -67.82f)
                arcToRelative(87.89f, 87.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 70.5f, 3.4f)
                close()
                moveTo(40.18f, 133.54f)
                curveToRelative(28.34f, -20f, 49.57f, -14.68f, 71.87f, -4.39f)
                curveTo(92f, 143.34f, 73.19f, 161.36f, 72.52f, 196.26f)
                arcTo(87.92f, 87.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.18f, 133.54f)
                close()
                moveTo(176.68f, 201.27f)
                curveToRelative(-31.45f, -14.55f, -37.47f, -35.58f, -39.71f, -60f)
                curveToRelative(12.72f, 5.86f, 26.31f, 10.75f, 41.3f, 10.75f)
                curveToRelative(11.33f, 0f, 23.46f, -2.8f, 36.63f, -10.08f)
                arcTo(88.2f, 88.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176.68f, 201.27f)
                close()
            }
        }.build()

        return _SpinnerBallFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpinnerBallFill: ImageVector? = null
