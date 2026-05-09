package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GlobeXFill: ImageVector
    get() {
        if (_GlobeXFill != null) {
            return _GlobeXFill!!
        }
        _GlobeXFill = ImageVector.Builder(
            name = "Filled.GlobeXFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -14.21f)
                lineToRelative(0f, 0f)
                curveToRelative(-1.12f, -0.91f, -20.88f, -17.32f, -31.06f, -49.77f)
                horizontalLineToRelative(26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(98.08f, 152.02f)
                arcToRelative(140.17f, 140.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -48f)
                horizontalLineToRelative(59.88f)
                arcTo(138f, 138f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcToRelative(154.7f, 154.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.84f, -24f)
                horizontalLineToRelative(38.51f)
                arcTo(87.61f, 87.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(102f, 88f)
                arcToRelative(115.11f, 115.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, -45f)
                arcToRelative(115.27f, 115.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, 45f)
                close()
                moveTo(170.75f, 88f)
                arcToRelative(135.28f, 135.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.3f, -45.6f)
                arcToRelative(88.29f, 88.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58f, 45.6f)
                close()
                moveTo(221.7f, 173.66f)
                lineTo(203.31f, 192f)
                lineToRelative(18.35f, 18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(192f, 203.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(180.69f, 192f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(192f, 180.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
            }
        }.build()

        return _GlobeXFill!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeXFill: ImageVector? = null
