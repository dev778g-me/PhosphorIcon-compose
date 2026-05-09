package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.WarningDiamondThin: ImageVector
    get() {
        if (_WarningDiamondThin != null) {
            return _WarningDiamondThin!!
        }
        _WarningDiamondThin = ImageVector.Builder(
            name = "Thin.WarningDiamondThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 136f)
                lineTo(128f, 80f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 172f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
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

        return _WarningDiamondThin!!
    }

@Suppress("ObjectPropertyName")
private var _WarningDiamondThin: ImageVector? = null
