package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.SmileyStickerBold: ImageVector
    get() {
        if (_SmileyStickerBold != null) {
            return _SmileyStickerBold!!
        }
        _SmileyStickerBold = ImageVector.Builder(
            name = "Bold.SmileyStickerBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156.22f, 219.79f)
                arcToRelative(95.9f, 95.9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 63.57f, -63.58f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(92f, 108f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(164f, 108f)
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
                moveTo(168f, 152f)
                curveToRelative(-8.3f, 14.35f, -22.23f, 24f, -40f, 24f)
                reflectiveCurveToRelative(-31.7f, -9.65f, -40f, -24f)
            }
        }.build()

        return _SmileyStickerBold!!
    }

@Suppress("ObjectPropertyName")
private var _SmileyStickerBold: ImageVector? = null
