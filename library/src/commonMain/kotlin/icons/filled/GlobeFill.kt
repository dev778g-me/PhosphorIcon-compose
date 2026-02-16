package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GlobeFill: ImageVector
    get() {
        if (_GlobeFill != null) {
            return _GlobeFill!!
        }
        _GlobeFill = ImageVector.Builder(
            name = "Filled.GlobeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                horizontalLineToRelative(0f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.12f, 104.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(206.36f, 88f)
                lineTo(170.71f, 88f)
                arcToRelative(135.28f, 135.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.3f, -45.6f)
                arcTo(88.29f, 88.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 206.37f, 88f)
                close()
                moveTo(216f, 128f)
                arcToRelative(87.61f, 87.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.33f, 24f)
                lineTo(174.16f, 152f)
                arcToRelative(157.44f, 157.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -48f)
                horizontalLineToRelative(38.51f)
                arcTo(87.61f, 87.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 128f)
                close()
                moveTo(128f, 43f)
                arcToRelative(115.27f, 115.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, 45f)
                lineTo(102f, 88f)
                arcTo(115.11f, 115.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 43f)
                close()
                moveTo(102f, 168f)
                lineTo(154f, 168f)
                arcToRelative(115.11f, 115.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -26f, 45f)
                arcTo(115.27f, 115.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 102f, 168f)
                close()
                moveTo(98.1f, 152f)
                arcToRelative(140.84f, 140.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -48f)
                horizontalLineToRelative(59.88f)
                arcToRelative(140.84f, 140.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                close()
                moveTo(148.45f, 213.6f)
                arcToRelative(135.28f, 135.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.3f, -45.6f)
                horizontalLineToRelative(35.66f)
                arcTo(88.29f, 88.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148.41f, 213.6f)
                close()
            }
        }.build()

        return _GlobeFill!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeFill: ImageVector? = null
