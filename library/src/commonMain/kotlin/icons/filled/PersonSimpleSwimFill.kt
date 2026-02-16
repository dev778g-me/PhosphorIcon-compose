package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PersonSimpleSwimFill: ImageVector
    get() {
        if (_PersonSimpleSwimFill != null) {
            return _PersonSimpleSwimFill!!
        }
        _PersonSimpleSwimFill = ImageVector.Builder(
            name = "Filled.PersonSimpleSwimFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(144f, 72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 72f)
                close()
                moveTo(210.89f, 184.19f)
                curveToRelative(-31.83f, 26.39f, -53.72f, 14.51f, -79.07f, 0.74f)
                curveToRelative(-26.61f, -14.44f, -56.76f, -30.81f, -96.93f, 2.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.22f, 12.31f)
                curveToRelative(31.83f, -26.39f, 53.72f, -14.5f, 79.07f, -0.74f)
                curveToRelative(15.11f, 8.2f, 31.35f, 17f, 49.93f, 17f)
                curveToRelative(14.14f, 0f, 29.64f, -5.11f, 47f, -19.5f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.22f, -12.32f)
                close()
                moveTo(34.89f, 147.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.22f, 12.31f)
                curveToRelative(31.83f, -26.38f, 53.72f, -14.5f, 79.07f, -0.74f)
                curveToRelative(15.11f, 8.2f, 31.35f, 17f, 49.93f, 17f)
                curveToRelative(14.14f, 0f, 29.64f, -5.11f, 47f, -19.5f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -10.22f, -12.31f)
                arcToRelative(75.79f, 75.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -19.28f, 12.06f)
                lineToRelative(-53.84f, -53.82f)
                arcTo(103.34f, 103.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64.24f, 72f)
                lineTo(40f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(64.24f, 88f)
                arcToRelative(87.66f, 87.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41.88f, 10.56f)
                lineTo(76.49f, 128.17f)
                curveTo(63.82f, 129.36f, 50.07f, 134.84f, 34.89f, 147.42f)
                close()
            }
        }.build()

        return _PersonSimpleSwimFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleSwimFill: ImageVector? = null
