package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FileCFill: ImageVector
    get() {
        if (_FileCFill != null) {
            return _FileCFill!!
        }
        _FileCFill = ImageVector.Builder(
            name = "Filled.FileCFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(48f, 180f)
                curveToRelative(0f, 11f, 7.18f, 20f, 16f, 20f)
                arcToRelative(14.07f, 14.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.07f, -4.51f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.88f, -0.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, 11.81f)
                arcTo(30.06f, 30.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 216f)
                curveToRelative(-17.65f, 0f, -32f, -16.15f, -32f, -36f)
                reflectiveCurveToRelative(14.35f, -36f, 32f, -36f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.39f, 9.19f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.73f, 11.09f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.9f, 0.38f)
                arcTo(14.24f, 14.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 160f)
                curveTo(55.18f, 160f, 48f, 169f, 48f, 180f)
                close()
                moveTo(216f, 88f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(116f, 232f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                lineTo(112f, 124f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(44f, 120f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 2.34f)
                lineToRelative(56f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 88f)
                close()
                moveTo(196f, 88f)
                lineTo(152f, 44f)
                lineTo(152f, 88f)
                close()
            }
        }.build()

        return _FileCFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileCFill: ImageVector? = null
