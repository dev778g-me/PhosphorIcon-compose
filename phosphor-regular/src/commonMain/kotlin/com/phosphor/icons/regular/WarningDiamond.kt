package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.WarningDiamond: ImageVector
    get() {
        if (_WarningDiamond != null) {
            return _WarningDiamond!!
        }
        _WarningDiamond = ImageVector.Builder(
            name = "Regular.WarningDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 136f)
                lineTo(128f, 80f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 172f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(26.32f, 122.38f)
                lineTo(122.37f, 26.33f)
                arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 133.61f, 26.33f)
                lineTo(229.66f, 122.38f)
                arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 229.66f, 133.62f)
                lineTo(133.61f, 229.67f)
                arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 122.37f, 229.67f)
                lineTo(26.32f, 133.62f)
                arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26.32f, 122.38f)
                close()
            }
        }.build()

        return _WarningDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _WarningDiamond: ImageVector? = null
