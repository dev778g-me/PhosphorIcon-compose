package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SmileyAngryFill: ImageVector
    get() {
        if (_SmileyAngryFill != null) {
            return _SmileyAngryFill!!
        }
        _SmileyAngryFill = ImageVector.Builder(
            name = "Filled.SmileyAngryFill",
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
                moveTo(80f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 140f)
                close()
                moveTo(158.66f, 188.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.09f, 2.23f)
                curveTo(141.07f, 186.34f, 136f, 184f, 128f, 184f)
                reflectiveCurveToRelative(-13.07f, 2.34f, -19.57f, 6.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.86f, -13.32f)
                curveTo(108f, 171.73f, 116.06f, 168f, 128f, 168f)
                reflectiveCurveToRelative(20f, 3.73f, 28.43f, 9.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 158.66f, 188.43f)
                close()
                moveTo(164f, 152f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 152f)
                close()
                moveTo(180.44f, 94.66f)
                lineTo(132.44f, 126.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.88f, 0f)
                lineToRelative(-48f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.88f, -13.32f)
                lineTo(128f, 110.39f)
                lineToRelative(43.56f, -29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.88f, 13.32f)
                close()
            }
        }.build()

        return _SmileyAngryFill!!
    }

@Suppress("ObjectPropertyName")
private var _SmileyAngryFill: ImageVector? = null
