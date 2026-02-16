package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FilmSlateFill: ImageVector
    get() {
        if (_FilmSlateFill != null) {
            return _FilmSlateFill!!
        }
        _FilmSlateFill = ImageVector.Builder(
            name = "Filled.FilmSlateFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 104f)
                horizontalLineTo(102.09f)
                lineTo(210f, 75.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.68f, -9.84f)
                lineToRelative(-8.16f, -30f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -19.42f, -11.13f)
                lineTo(35.81f, 64.74f)
                arcToRelative(15.75f, 15.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.7f, 7.4f)
                arcToRelative(15.51f, 15.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 12f)
                lineTo(32f, 111.56f)
                curveToRelative(0f, 0.14f, 0f, 0.29f, 0f, 0.44f)
                verticalLineToRelative(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 104f)
                close()
                moveTo(192.16f, 40f)
                lineToRelative(6f, 22.07f)
                lineTo(164.57f, 71f)
                lineTo(136.44f, 54.72f)
                close()
                moveTo(77.55f, 70.27f)
                lineToRelative(28.12f, 16.24f)
                lineToRelative(-59.6f, 15.73f)
                lineToRelative(-6f, -22.08f)
                close()
            }
        }.build()

        return _FilmSlateFill!!
    }

@Suppress("ObjectPropertyName")
private var _FilmSlateFill: ImageVector? = null
